package com.innova.enumqualifier;

@EQualifier(EJavaVersion.JAVA17)
public class Java17 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Optional java version 17";
	}
}
