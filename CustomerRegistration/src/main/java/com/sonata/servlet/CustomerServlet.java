package com.sonata.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sonata.doa.CustomerImpl;
import com.sonata.model.Customer;

//package net.javaguides.employeemanagement.web;

import java.io.IOException;


//import net.javaguides.employeemanagement.dao.EmployeeDao;
//import net.javaguides.employeemanagement.model.Employee;


@WebServlet("/register")
public class CustomerServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private CustomerImpl customerImpl;

   public void init() {
	   customerImpl = new CustomerImpl();
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

       String firstName = request.getParameter("firstName");
       String lastName = request.getParameter("lastName");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String address = request.getParameter("address");
       String contact = request.getParameter("contact");

       Customer customer = new Customer();
       customer.setFirstName(firstName);
       customer.setLastName(lastName);
       customer.setUsername(username);
       customer.setPassword(password);
       customer.setContact(contact);
       customer.setAddress(address);

       try {
    	   customerImpl.registerCustomer(customer);
       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

       response.sendRedirect("customerdetails.jsp");
   }
}
