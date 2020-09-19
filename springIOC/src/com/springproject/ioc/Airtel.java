package com.springproject.ioc;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("Airtel Constructor Called");
	}
	
	@Override
	public void calling() {
		System.out.println("calling from airtel");
		
	}
	@Override
	public void data() {
		System.out.println("browsing internet using airtel sim");
		
	}
}
