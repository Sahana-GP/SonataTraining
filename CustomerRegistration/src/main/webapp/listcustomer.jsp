<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>
<head>
    <title>Customer Details</title>
</head>
<body>
<h2>Customer Details</h2>
<%
      try {
          /* Create string of connection url within specified 
          format with machine name, port number and database name.
          Here machine name id localhost and database name is student. */
          String connectionURL = "jdbc:mysql://localhost:3306/customers";

          // declare a connection by using Connection interface
          Connection connection = null;

          // declare object of Statement interface that is used for 
         // executing sql statements.
          Statement statement = null;

          // declare a resultset that uses as a table for output data 
        
          ResultSet rs = null;

          // Load JBBC driver "com.mysql.jdbc.Driver".
          Class.forName("com.mysql.jdbc.Driver").newInstance();

          /* Create a connection by using getConnection() 
          method that takes parameters of string type 
	  connection url, user name and password to connect to database. */
          connection = DriverManager.getConnection(connectionURL, "root", "root@123");

          /* createStatement() is used for create statement 
object that is used for sending sql statements  to the specified database. */
          statement = connection.createStatement();

          // sql query to retrieve values from the secified table.
          String QueryString = "SELECT * from customer";
          rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
    <%
    while (rs.next()) {
    %>
    <TR>
        <TD><%=rs.getString(1)%></TD>
        <TD><%=rs.getString(2)%></TD>
        <TD><%=rs.getString(3)%></TD>
       
        <TD><%=rs.getString(5)%></TD>
        <TD><%=rs.getString(6)%></TD>
    </TR>
    <%   }    %>
    <%
    // close all the connections.
    rs.close();
    statement.close();
    connection.close();
} catch (Exception ex) {
    %>
    </font>
    <font size="+3" color="red"></b>
        <%
                out.println("Unable to connect to database.");
            }
        %>
    </TABLE><TABLE>
        <TR>
            <TD><FORM ACTION="customerregister.jsp" method="get" >
            <button type="submit"><-- back</button></TD>
        </TR>
    </TABLE>
</font>
</body>
</html>



