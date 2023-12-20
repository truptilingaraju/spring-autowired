package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {

	public void eat() {
		System.out.println("cow is eating");
		
	}
}
