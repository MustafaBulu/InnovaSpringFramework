package com.innova.stereotype;

@InnovaMultipleAnnotation
// streotype yapısı çok annotation ı teke indirir.
public class StudentBean {
	
	private String name = "Deneme";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
