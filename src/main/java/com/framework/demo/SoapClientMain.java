package com.framework.demo;

import com.soap.wsClient.SoapCalculatorService;

public class SoapClientMain {
	
	public static void main(String[] args) {
		testAddService();
	}
	public static void testAddService() {
		SoapCalculatorService sc=new SoapCalculatorService();
		int res=sc.getSoapCalculatorPort().add(12, 10);
		System.out.println("Soap webservice Add Result:"+res);
	}
	
}
