package com.innova.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultJavaVersion implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "java version 11";
	}
	
}
