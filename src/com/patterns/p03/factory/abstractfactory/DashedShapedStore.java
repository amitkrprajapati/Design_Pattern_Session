package com.patterns.p03.factory.abstractfactory;

import com.patterns.p03.factory.shape.*;

public class DashedShapedStore extends ShapeStore {
	@Override
	Shape createShape(ShapeType shapeType) {
		Shape shape = null;
		switch (shapeType) {
			case CIRCLE:
				shape = new Circle();
				break;
			case SQUARE:
				shape = new Square();
				break;
			case TRIANGLE:
				shape = new Triangle();
				break;
		}
		return shape;
	}
}
