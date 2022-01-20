package com.innova.cdi.scoped;

import java.io.Serializable;

import javax.inject.Named;

// pojo<Bean<managementBean<CdiBean

@Named("scopedCDI")
// @RequestScoped // tek bir istek yaşar ve sonrasında ölür. performansı olumsuz
// etkiler

public class RequestScope implements Serializable {
	
	public String scoped() {
		
		return "Request Scope: " + hashCode();
	}
	
}
