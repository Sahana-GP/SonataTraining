package com.sonata.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.model.Customer;




//import com.sonata.jsp.jdbc.bean.Customer;



public class CustomerImpl {
        public int registerCustomer(Customer customer) throws ClassNotFoundException {
            String INSERT_USERS_SQL = ("INSERT INTO new_table values (?, ?, ?, ?,?,?);");

              int result = 0;

              Class.forName("com.mysql.jdbc.Driver");


              try (Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/customers", "root", "root@123");


                  // Step 2:Create a statement using connection object
                    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
              
                    preparedStatement.setString(1, customer.getFirstName());
                    preparedStatement.setString(2,customer.getLastName());
                    preparedStatement.setString(3, customer.getUsername());
                    preparedStatement.setString(4, customer.getPassword());
                    preparedStatement.setString(5,customer.getAddress());
                    preparedStatement.setString(6, customer.getContact());

          System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    result = preparedStatement.executeUpdate();


             
              } catch (SQLException e) {
                    // process sql exception
                    e.printStackTrace();
                }
                return result;
            }
        
}