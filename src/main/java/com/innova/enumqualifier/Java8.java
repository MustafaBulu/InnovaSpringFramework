package com.innova.enumqualifier;

@EQualifier(EJavaVersion.JAVA8)
public class Java8 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Optional java version 8";
	}
}
