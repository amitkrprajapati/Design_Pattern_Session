package com.patterns.p01.strategy.bad;

public class Knight implements Character {
	@Override
	public void fight() {
		System.out.println("Fighting with Sword");
	}

	@Override
	public void rideOn() {
		System.out.println("Riding on horse");
	}

	@Override
	public void display() {
		System.out.println("I am Knight");
	}
}