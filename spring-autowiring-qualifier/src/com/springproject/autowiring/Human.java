package com.springproject.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	// default byType, if fails then byName
	@Autowired 
	// To identify which Heart object need to create
	@Qualifier("humanHeart") 
	private Heart heart;

	/*
	 * No need to write setter if you are using @Autowired before the dependency
	 * 
	 * public Human() {
	 * 
	 * 	System.out.println("Default constructor is called");
	 * 
	 * }
	 * 
	 * // @Autowired 
	 * public Human(Heart heart) {
	 * 
	 * 	this.heart = heart;
	 * 
	 * 	System.out.println("Peramitarized Constructor is called");
	 * 
	 * }
	 * 
	 * @Autowired 
	 * @Qualifier("humanHeart")
	 * public void setHeart(Heart heart) {
	 * 
	 * 	this.heart = heart;
	 * 
	 * 	System.out.println("Setter method is called");
	 * 
	 * }
	 */

	public void startPumping() {
		if (heart != null) {

			heart.pump();

			System.out.println("Name of the Animal: " + heart.getNameOfAnimal());
			System.out.println("No of Heart: " + heart.getNoOfHeart());

		} else {
			System.out.println("Heart is dead!");
		}
	}
}
