package com.innova.iocli.cdili;

public class Maintest {
	
	public static void main(String[] args) {
		
		JavaManager javaManager = new JavaManager(new Java20());
		javaManager.newJavaVersion();
		
	}
}
