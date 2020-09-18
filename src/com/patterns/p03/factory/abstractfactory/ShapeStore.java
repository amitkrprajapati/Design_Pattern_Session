package com.patterns.p03.factory.abstractfactory;

import com.patterns.p03.factory.shape.Shape;
import com.patterns.p03.factory.shape.ShapeType;

public abstract class ShapeStore {
	public void drawShape(ShapeType shapeType) {
		Shape shape = createShape(shapeType);
		// Some Logic...

		shape.draw();
		// Some more logic
	}
	abstract Shape createShape(ShapeType shapeType);
}
