package com.patterns.p01.strategy.good.RideOnBehaviours;

public class RideOnHorse implements RideOn {

	@Override
	public void ride() {
		System.out.println("Riding on Horse");
	}
}
