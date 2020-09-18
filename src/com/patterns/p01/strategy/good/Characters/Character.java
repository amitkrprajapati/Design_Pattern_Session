package com.patterns.p01.strategy.good.Characters;

import com.patterns.p01.strategy.good.RideOnBehaviours.RideOn;
import com.patterns.p01.strategy.good.Weapons.Weapon;

public abstract class Character {
	Weapon weapon;
	RideOn rideOn;

	void fight() {weapon.fight();
	}

	void ride() {
		rideOn.ride();
	}
}
