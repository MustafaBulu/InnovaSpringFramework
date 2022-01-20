package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Java18 implements IJavaVersion {
	
	// implement edilmiş classlara alternative yazdık
	@Override
	public String javaVersion(String data) {
		// TODO Auto-generated method stub
		return "Version Java 18";
	}
	
}
