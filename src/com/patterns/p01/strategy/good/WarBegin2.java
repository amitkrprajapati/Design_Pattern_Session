package com.patterns.p01.strategy.good;

import com.patterns.p01.strategy.good.Characters.Character;
import com.patterns.p01.strategy.good.Characters.King;
import com.patterns.p01.strategy.good.RideOnBehaviours.RideOn;
import com.patterns.p01.strategy.good.RideOnBehaviours.RideOnChariot;
import com.patterns.p01.strategy.good.Weapons.Sword;
import com.patterns.p01.strategy.good.Weapons.Weapon;

public class WarBegin2 {
	public static void main(String[] args) {

		// Create King
		Weapon sword = new Sword();
		RideOn chariot =  new RideOnChariot();
		Character king = new King(sword, chariot);

		king.ride();
		king.fight();

	}
}
