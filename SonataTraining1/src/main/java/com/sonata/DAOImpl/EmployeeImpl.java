package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.DAO.EmployeeIntf;
import com.sonata.emodel.Employee;

public class EmployeeImpl implements EmployeeIntf {
	DBConnection db = new DBConnection();
	int row = 0;
	
	public int save(Object object) {
		 Employee e1 = (Employee) object;
		 try {
			 PreparedStatement s1 = db.getConnection().prepareStatement("insert into employee value (?,?,?)");
			 s1.setInt(1, e1.getEmpid());
			 s1.setString(2,e1.getEmpname());
			 s1.setDouble(3, e1.getEmpsal());
			 row = s1.executeUpdate();
			 db.closeConnection();
		 }catch (SQLException e) { 
		 e.printStackTrace();}
		return  row;
	}

	

	
	/*public List<Employee> getData() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
