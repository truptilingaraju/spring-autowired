package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Earth {

//	@Autowired
	private Animal animal;
	
	public Animal getAnimal() {
		return animal;
	}

//	@Autowired
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Autowired
	public Earth(Animal animal) {
	super();
	this.animal = animal;
}

	public void rotate() {
		System.out.println("earth is rotating");
		animal.eat();
	}
}
