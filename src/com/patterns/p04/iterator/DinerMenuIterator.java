package com.patterns.p04.iterator;

import java.util.ArrayList;

public class DinerMenuIterator implements IteratorInterface {
	private ArrayList<String> menuItems;
	private int position = 0;

	public DinerMenuIterator(ArrayList<String> menuItems) {
		this.menuItems = menuItems;
	}
	@Override
	public Object next() {
		String item = menuItems.get(position);
		position += 1;
		return item;
	}

	@Override
	public boolean hasNext() {
		return menuItems.size() > position;
	}
}
