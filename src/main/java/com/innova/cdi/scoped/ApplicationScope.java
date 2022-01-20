package com.innova.cdi.scoped;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBean

@Named("applicationCDI")
@ApplicationScoped // server ayakta kaldığı sürece yaşar farklı ve aynı browserda çalışır

public class ApplicationScope implements Serializable {
	
	public String scoped() {
		
		return "Application Scope: " + hashCode();
	}
}
