package com.innova.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBean

@Named
@ApplicationScoped

public class _01_Named implements Serializable {
	
	private String computerName;
	
	// parametresiz constructor
	public _01_Named() {
		this.computerName = "Bilgisayar Adı 521512f1";
	}
	// parametreli constuctor
	
	public _01_Named(String computerName) {
		this.computerName = computerName;
	}
	
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + "]";
	}
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
}
