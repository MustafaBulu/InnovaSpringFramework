package com.innova.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

// loose coupling gevşek bağlama-->@Inject ve @Produces
@Named(value = "uretenCDI")
@ApplicationScoped

public class _03_Produces implements Serializable {
	
	// üreten
	@Produces
	
	public List<String> uretenLİsts() {
		
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("Nevşehir");
		listem.add("Kutahya");
		
		return listem;
		
	}
	
}
