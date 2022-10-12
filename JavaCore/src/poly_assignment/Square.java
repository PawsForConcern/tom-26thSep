package poly_assignment;

public class Square extends Shape {
	public float sideLength;
	public Square(String colour,float sideLength) {
		super(colour);
		this.sideLength=sideLength;
	}
	public float area() {
		return sideLength*sideLength;
	}
}

