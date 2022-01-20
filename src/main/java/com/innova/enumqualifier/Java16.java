package com.innova.enumqualifier;

@EQualifier(EJavaVersion.JAVA16)
public class Java16 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Optional java version 16";
	}
}
