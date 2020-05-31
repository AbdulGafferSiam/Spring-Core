package com.springproject.ioc;

public class Taletalk implements Sim{
	@Override
	public void calling() {
		System.out.println("calling from Taletalk");
		
	}
	@Override
	public void data() {
		System.out.println("browsing internet using Taletalk sim");
		
	}
}
