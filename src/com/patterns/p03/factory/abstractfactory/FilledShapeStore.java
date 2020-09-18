package com.patterns.p03.factory.abstractfactory;

import com.patterns.p03.factory.shape.Shape;
import com.patterns.p03.factory.shape.ShapeType;

public class FilledShapeStore extends ShapeStore{
	@Override
	Shape createShape(ShapeType shapeType) {
		return null;
	}
}
