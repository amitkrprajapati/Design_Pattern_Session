package com.patterns.p01.strategy.good.Characters;

import com.patterns.p01.strategy.good.RideOnBehaviours.RideOn;
import com.patterns.p01.strategy.good.Weapons.Weapon;

public class King extends Character {
	public King(Weapon weapon, RideOn rideOn) {
		this.weapon = weapon;
		this.rideOn = rideOn;
	}
}
