package poly_assignment;

import java.lang.Math;

public class Circle extends Shape {
	public float radius;
	public Circle(String colour,float radius) {
		super(colour);
		this.radius = radius;
	}
	public float area() {
		return (float)Math.PI*radius*radius;
	}
}
