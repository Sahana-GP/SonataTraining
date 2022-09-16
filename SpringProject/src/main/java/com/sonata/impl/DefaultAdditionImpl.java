package com.sonata.impl;

import org.springframework.stereotype.Component;

import com.sonata.spring.Addition;

@Component
public class DefaultAdditionImpl implements Addition{
	

		public int add(int n1, int n2) {
			return n1+n2;
		}

	

}
