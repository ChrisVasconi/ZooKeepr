package com.chrisvasconi.zookeeper;



public class Gorilla extends Mammal {
	public String Name = "new Gorilla";
	
	public void throwSomething() {
		System.out.println(Name + " Has thrown something");
		energyLevel -= 5;
}
	
	public void eatBananas() {
		System.out.println(Name + " eats a bannana and is satisfied!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println(Name + " Climbed a tree!");
		energyLevel -= 10;
	}
	}

	

