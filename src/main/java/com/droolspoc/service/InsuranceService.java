package com.droolspoc.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.droolspoc.model.InsuranceProduct;

@Service
public class InsuranceService {

	private final KieContainer kieContainer;   
	
	@Autowired
	public InsuranceService(KieContainer kieContainer) 
	{
		this.kieContainer = kieContainer;
	}
	
	public InsuranceProduct getInsurancePremium(InsuranceProduct product) {
		
		try {
			KieSession kieSession = kieContainer.newKieSession("rulesSession");
			kieSession.insert(product);
			kieSession.fireAllRules();
			kieSession.dispose();
			return product;
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
			return null;
		}
		
	}
	
}
