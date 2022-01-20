package com.innova.cdi.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBean

@Named("sessionCDI")
@SessionScoped // tek oturum boyunca yaşar farklı browserlarda çalışmaz aynı browserda çalışır

public class SessionScope implements Serializable {
	
	public String scoped() {
		
		return "Session Scope: " + hashCode();
	}
	
}
