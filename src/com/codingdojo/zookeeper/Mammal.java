package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel;
	
	//------------- Constructor -------------
	public Mammal() {
		this.energyLevel = 100;
	}
	
	//--------------------  Getters and Setters  ----------------------
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//-------------------- Display  ------------------------------
	public void displayEnergy() {
		System.out.println("Energy Level: " + this.energyLevel);
	}
}
