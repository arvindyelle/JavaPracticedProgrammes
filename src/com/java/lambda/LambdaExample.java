package com.java.lambda;


interface Shape{
	void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw() in rectangle class: rectangle drawn");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw() in square class: square drawn");
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw() in circle class: circle drawn");
	}
	
}

public class LambdaExample {
	public static void main(String[] args) {
		//Shape rectangleShape = () -> System.out.println("draw() in rectangle class: rectangle drawn");
		Shape squareShape = () -> System.out.println("draw() in square class: square drawn");
		Shape circuleShape = () -> System.out.println("draw() in circle class: circle drawn");
		print(() -> System.out.println("draw() in rectangle class: rectangle drawn"));
		print(squareShape);
		print(circuleShape);
	}
	
	public static void print(Shape shape) {
		shape.draw();
	}
}
