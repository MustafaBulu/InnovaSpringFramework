package com.innova.iocli.cdili;

import javax.inject.Inject;

public class JavaManager {
	// manuel IOC kullandım
	// Cdi
	
	// interface çağırıyoruz
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	
	private JavaVersion javaInterface;
	
	// paramatreli constructor
	
	public JavaManager(JavaVersion javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Metot
	
	public void newJavaVersion() {
		javaInterface.javaVersion();
	}
	
}
