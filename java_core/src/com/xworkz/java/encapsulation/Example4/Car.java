package com.xworkz.java.encapsulation.Example4;

public class Car {
	private int cost;
	public Car(int cost) {
		if(cost>0) {
			this.cost=cost;
		}
	}
	public int getCost() {
		return cost;
	}
	public void SetCost(int cost) {
		if(cost>0) {
			this.cost = cost;
		}
	}

}
