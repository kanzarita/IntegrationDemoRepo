package edu.esprit.integration.demo.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import edu.esprit.integration.demo.services.CalculatorService;

@RequestScoped
@ManagedBean(name="cal")
public class CalculatorManagedBeans {

	@EJB
	CalculatorService calculatorService = new CalculatorService();
	
	public int add(int a,int b){
		
		return calculatorService.Addition(a, b);
	}
	
public int sous(int a,int b){
		
		return calculatorService.Soustration(a, b);
	}
	
public int div(int a,int b){
	
	return calculatorService.Division(a, b);
}
public int Mult(int a,int b){
	
	return calculatorService.Multiplication(a, b);
}

	
}
