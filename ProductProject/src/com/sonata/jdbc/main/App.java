package com.sonata.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.sonata.jdbc.DOA.impl.DBConnection;
import com.sonata.jdbc.DOA.impl.ProductImpl;
import com.sonata.jdbc.emodel.Product;

public class App {
	


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Product p= new Product();
				Product p1= new Product();
				
				ProductImpl pi=new ProductImpl();
				p.setProductID(99);
				p.setProductName("cpu");
				p.setProductPrice(5000);
				
				p1.setProductID(98);
				p1.setProductName("monitor");
				p1.setProductPrice(200);
			
//				p2.setPrdId(p.getPrdId());
//				p2.setPrdName("pencil");
//				p2.setprdPrice(200);
//				p.setPrdName("pen");
//				p.setprdPrice(300.2);
				List<Product> s2 = pi.getdata();    	
		        for(int i=1;i <= s2.size();i++) {
		        	//System.out.println(s2.get(10));
		        	System.out.println(s2.get(i).getProductID());
		        	System.out.println(s2.get(i).getProductName());
		        	System.out.println(s2.get(i).getProductPrice());
		        }
				
				
				int a1=pi.save(p);
				//int a2=pi.update(p); 
				
			}}