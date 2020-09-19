package com.springproject.diloosecoupling;

public class Student {
	
	// my pocket will support every type of cheat using interface reference
	private Cheat cheat;	

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.cheat();
	}
	
}
