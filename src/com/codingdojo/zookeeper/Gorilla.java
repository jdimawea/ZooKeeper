package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("GORILLA THROW!!!!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("YUMMY IN GORILLA TUMMY!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("GORILLA CLIMB!!!!");
		energyLevel -= 10;
	}
}
