package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	private Mobile mobile;
	
	public void use() {
		System.out.println("person is using");
		mobile.text();
	}
}
