package com.innova.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualifierCDI")
@ApplicationScoped
public class QualifierManagerJava implements Serializable {
	
	// default için
	// @Inject
	// private IJavaVersion iJavaVersion;
	// default için
	
	@Inject
	@QualifierCokluSecim
	private IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		
		return iJavaVersion.javaVersion("Sürüm");
		
	}
	
}
