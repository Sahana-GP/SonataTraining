package com.sonata.jdbc.DOA.impl;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.sonata.DAO.StudentIntf;
//import com.sonata.DAOImpl.DBConnection;
//import com.sonata.Model.Student;
//import com.sonata.Model.Student;
import com.sonata.jdbc.DOA.ProductIntf;
import com.sonata.jdbc.emodel.Product;


public class ProductImpl implements ProductIntf{
	DBConnection db=new DBConnection();
	int row=0;
	
	@Override
	public int save(List list) {
		// TODO Auto-generated method stub
		Product p1= (Product) list;
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("insert into product values(?,?,?)");
			ps.setInt(1, p1.getProductID());
			ps.setString(2, p1.getProductName());
			ps.setDouble(3, p1.getProductPrice());
			row=ps.executeUpdate();
			db.closeConnection();
					}catch(SQLException e) {e.printStackTrace();}
		return row;
	}


	@Override
	public int update(List list) {
		// TODO Auto-generated method stub
		Product p1= (Product) list;
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("UPDATE product SET prdName = ? , prdPrice = ? WHERE prdId = ?");
			ps.setInt(1, p1.getProductID());
			ps.setString(2, p1.getProductName());
			ps.setDouble(3, p1.getProductPrice());
			row=ps.executeUpdate();
			db.closeConnection();
					}catch(SQLException e) {e.printStackTrace();}
		return row;
	}


	@Override
	public List<Product> getdata() {
		// TODO Auto-generated method stub
		List<Product> prd = new ArrayList<Product>();
		   try {
			   PreparedStatement ps = db.getConnection().prepareStatement("select * from product");
			   ResultSet rs = ps.executeQuery();
			   
			   while (rs.next()) {
				   Product p2 = new Product();
				 p2.setProductID(rs.getInt(1));
				 p2.setProductName(rs.getString(2));	
				 p2.setProductPrice(rs.getDouble(3));
				 prd.add(p2);
			   }
		
	}catch(SQLException e1) {e1.printStackTrace();}
		   
		   return prd;
}


	@Override
	public int delete(List list) {
		// TODO Auto-generated method stub
		return 0;
	}
}