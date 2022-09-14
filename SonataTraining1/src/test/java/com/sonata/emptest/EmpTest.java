package com.sonata.emptest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.DAO.EmployeeIntf;
import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.emodel.*;

class EmpTest {
	Employee e1 = new Employee();
    EmployeeImpl ep1 = new EmployeeImpl();
    
    @Test
    public void dbTest1() {
        e1.setEmpid(108);
        e1.setEmpname("veer");
        e1.setEmpsal(6500.00);
        assertEquals(0, ep1.save(e1));
    }
    
    @Test
    public void dbTest2() {
        e1.setEmpid(106);
        e1.setEmpname("ravi");
        e1.setEmpsal(7000.00);
        assertEquals(0, ep1.save(e1));
    }
}
