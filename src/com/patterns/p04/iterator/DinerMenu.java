package com.patterns.p04.iterator;

import java.util.ArrayList;

public class DinerMenu {

	ArrayList<String> menuItem =  new ArrayList<>();

	public void addItem(String item)
	{
		menuItem.add(item);
	}
	public DinerMenuIterator getIterator()
	{
		return new DinerMenuIterator(menuItem);
	}
}
