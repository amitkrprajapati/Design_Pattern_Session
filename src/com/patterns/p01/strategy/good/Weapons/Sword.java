package com.patterns.p01.strategy.good.Weapons;

public class Sword implements Weapon{
	@Override
	public void fight() {
		System.out.println("Fighting with Sword");
	}
}
