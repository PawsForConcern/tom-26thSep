package poly_assignment;

abstract class Shape {
	public String colour;
	public abstract float area();
	public Shape(String colour) {
		this.colour = colour;
	}
}
