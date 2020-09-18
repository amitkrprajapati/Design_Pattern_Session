package com.patterns.p04.iterator;

public class StartIterator {
	public static void main(String[] args) {

		DinerMenu dinerMenu = new DinerMenu();
		// Lets Add Some Item in Menu.
		dinerMenu.addItem("Pizza");
		dinerMenu.addItem("Chicken Tikka");

		DinerMenuIterator iterator = dinerMenu.getIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}



	}
}
