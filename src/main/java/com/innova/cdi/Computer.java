package com.innova.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBean

@Named
@ApplicationScoped

public class Computer implements Serializable {
	
	private String computerName;
	
	// parametresiz constructor
	public Computer() {
		this.computerName = "Bilgisayar Adı 521512f1";
	}
	// parametreli constuctor
	
	public Computer(String computerName) {
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
