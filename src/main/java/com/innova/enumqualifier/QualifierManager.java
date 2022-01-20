package com.innova.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped

public class QualifierManager {
	// default
	// @Inject
	// IJavaVersion iJavaVersion;
	
	// opsiyonel
	@Inject
	@EQualifier(EJavaVersion.JAVA17)
	IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion("Seçim");
		
	}
	
}
