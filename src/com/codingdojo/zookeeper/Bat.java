package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
	protected int energyLevel; 
	
	public Bat() {
		super.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Im BATMAN");
		super.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("I HUNGY");
		super.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("RAIN FIRE");
		super.energyLevel -= 100;
	}
}
