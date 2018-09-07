package com.droolspoc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.droolspoc.model.InsuranceProduct;
import com.droolspoc.service.InsuranceService;

@RestController
public class InsuranceController {

	private final InsuranceService service;
	
	@Autowired
	public InsuranceController(InsuranceService service)
	{
		this.service = service;
	}
	
	@RequestMapping(value = "/getPremium", method = RequestMethod.GET, produces = "application/json")
	public InsuranceProduct getPremium(@RequestParam(required = true) String type, @RequestParam(required = true) Integer maturityPeriod) {

		InsuranceProduct product = new InsuranceProduct();
		product.setType(type);
		product.setMaturityPeriod(maturityPeriod);

		service.getInsurancePremium(product);
		

		return product;
	}
}
