package com.innova.iocli.cdisiz;

public class Maintest {
	
	public static void main(String[] args) {
		
		JavaManager javaManager = new JavaManager(new Java20());
		javaManager.newJavaVersion();
		
	}
}
