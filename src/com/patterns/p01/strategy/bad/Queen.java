package com.patterns.p01.strategy.bad;

public class Queen implements Character {
	@Override
	public void fight() {
		System.out.println("Fighting with dagger");
	}

	@Override
	public void rideOn() {
		System.out.println("Riding on chariot");
	}

	@Override
	public void display() {
		System.out.println("I am Queen");
	}
}