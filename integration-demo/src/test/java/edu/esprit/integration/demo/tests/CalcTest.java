package edu.esprit.integration.demo.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.integration.demo.managed.beans.CalculatorManagedBeans;

public class CalcTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		CalculatorManagedBeans cal = new CalculatorManagedBeans();
		System.out.println(cal.add(2, 3));
		cal.add(2, 3);
		
		
	}
	@Test
	public void testS() {
		CalculatorManagedBeans cal = new CalculatorManagedBeans();
		System.out.println(cal.sous(8, 5));
		cal.sous(8, 5);
		
		
	}
	@Test
	public void testM() {
		CalculatorManagedBeans cal = new CalculatorManagedBeans();
		System.out.println(cal.Mult(2, 3));
		cal.Mult(2, 3);
		
		
	}
	@Test
	public void testD() {
		CalculatorManagedBeans cal = new CalculatorManagedBeans();
		System.out.println(cal.div(5, 0));
		cal.div(5, 0);
		
		
	}

}
