package edu.esprit.integration.demo.services;

import javax.ejb.Stateless;

@Stateless(name="calcul")
public class CalculatorService {
	
	public int Addition(int a, int b){
		
		return a+b;
	}
	
public int Soustration(int a, int b){
		
		return a-b;
	}

public int Multiplication(int a, int b){
	
	return a*b;
}
public int Division(int a, int b){
	
	try {
		return a/b;
	} catch (ArithmeticException e) {
	return 0;
//		e.printStackTrace();
	}
}


	
}
