package com.tnsif.springcorebasics;

import org.springframework.stereotype.Component;

@Component
public class College {
	
	private Student s1;

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public void display() {
		System.out.println("Manakula ");
		s1.display();
	}
	
	public College() {
		System.out.println("College object created");
	}
}
