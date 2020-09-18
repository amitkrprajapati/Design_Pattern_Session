package com.patterns.p01.strategy.bad;

public class WarBegin {
	public static void main(String[] args) {
		Character king = new King();
		king.display();
		king.rideOn();
		king.fight();
		System.out.println();

		Character queen = new Queen();
		queen.display();
		queen.rideOn();
		queen.fight();
		System.out.println();

		Character knight =  new Knight();
		knight.display();
		knight.rideOn();
		knight.fight();
		System.out.println();
	}
}
