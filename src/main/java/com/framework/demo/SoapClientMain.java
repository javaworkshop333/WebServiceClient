package com.framework.demo;

import com.soap.wsClient.SoapCalculatorService;

public class SoapClientMain {
	public static void main(String[] args) {
		testAddService();
		testLoginService();
	}
	public static void testAddService() {
		SoapCalculatorService sc=new SoapCalculatorService();
		int res=sc.getSoapCalculatorPort().add(100,60);
		System.out.println("Soap webservice Add Result:"+res);
	}
	public static void testLoginService() {
		SoapCalculatorService sc=new SoapCalculatorService();
		boolean res=sc.getSoapCalculatorPort().login("john", "john1!");
		System.out.println("Soap webservice login Result:"+res);
	}
}
