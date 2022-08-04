package com.chrisvasconi.zookeeper;

//--------------Attributes (private/protected)--------
public class Mammal {
	public int energyLevel = 100;
	public int displayEnergy() {
		System.out.println("Energy level" + energyLevel);
		return energyLevel;
	}
}
