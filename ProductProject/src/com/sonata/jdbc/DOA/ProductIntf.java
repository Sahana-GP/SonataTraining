package com.sonata.jdbc.DOA;

import java.util.List;

//import com.sonata.Model.Student;
import com.sonata.jdbc.emodel.Product;

public interface ProductIntf {
	
	public int save(List list);
	public int update(List list);
	public int delete(List list);
	public List<Product> getdata();
		
	}

