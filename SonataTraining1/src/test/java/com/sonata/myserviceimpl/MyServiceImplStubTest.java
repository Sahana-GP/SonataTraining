package com.sonata.myserviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sonata.myservice.MyServiceIntf;
import com.sonata.myservice.MyServiceStub;

class MyServiceImplStubTest {

	@Test
	void test() {
		MyServiceIntf my = new MyServiceStub();
		MyServiceImpla mys = new MyServiceImpla(my);
		List<String> filteredMySer = mys.retrivalRelated("Dummy");
		assertEquals(2, filteredMySer.size());
		
	}

}
