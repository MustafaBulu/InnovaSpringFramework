package com.innova.qualifier;

import javax.enterprise.inject.Default;

@Default // defaultta bu obje gelsin
public class Java11 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		
		return "Default Java 11";
		
	}
	
}
