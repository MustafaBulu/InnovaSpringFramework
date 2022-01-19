package com.innova.iocli.cdisiz;

public class JavaManager {
	
	// interface çağırıyoruz
	
	private JavaVersion javaInterface;
	
	// paramatreli constructor
	
	public JavaManager(JavaVersion javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Metot
	
	public void newJavaVersion() {
		javaInterface.javaVersion();
	}
	
}
