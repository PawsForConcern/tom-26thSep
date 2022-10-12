package open_closed;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(23.00);
		Rectangle r = new Rectangle();
		r.setLength(10.00);
		r.setWidth(20.00);
		System.out.println(AreaCalculator.calculateShapeArea(c));
		System.out.println(AreaCalculator.calculateShapeArea(r));
	}
}
