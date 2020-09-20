package com.patterns.p03.factory;

import com.patterns.p03.factory.abstractfactory.FilledShapeStore;
import com.patterns.p03.factory.abstractfactory.ShapeStore;
import com.patterns.p03.factory.shape.*;
import com.patterns.p03.factory.simple.SimpleShapeFactory;

public class StartFactory {
	public static void main(String[] args) {
		System.out.println("Starting Factory");

		// ShapeType shapeType = ShapeType.CIRCLE;
		// Shape shape = null;
		// switch (shapeType) {
		// 	case CIRCLE:
		// 		shape = new Circle();
		// 		break;
		// 	case SQUARE:
		// 		shape = new Square();
		// 		break;
		// 	case TRIANGLE:
		// 		shape = new Triangle();
		// 		break;
		// }


		// SimpleShapeFactory simpleShapeFactory =  new SimpleShapeFactory();
		// Shape shape = simpleShapeFactory.getShape(ShapeType.TRIANGLE);
		// shape.draw();

		ShapeStore myShape = new FilledShapeStore();
		myShape.drawShape(ShapeType.CIRCLE);
	}
}
