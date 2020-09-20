package com.patterns.p03.factory.abstractfactory;

import com.patterns.p03.factory.shape.*;
import com.patterns.p03.factory.shape.Shape;
import com.patterns.p03.factory.shape.ShapeType;

public class FilledShapeStore extends ShapeStore{
	@Override
	Shape createShape(ShapeType shapeType) {
		Shape shape = null;
		switch (shapeType) {
			case CIRCLE:
				shape = new FilledCircle();
				break;
			// case SQUARE:
			// 	shape = new FilledSquare();
			// 	break;
			// case TRIANGLE:
			// 	shape = new FilledTriangle();
			// 	break;
			default: new FilledCircle();
		}
		return shape;
	}
}
