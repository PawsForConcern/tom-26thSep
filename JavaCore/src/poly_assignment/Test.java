package poly_assignment;

public class Test {
	public static void main(String args[]) {
		Circle circ1 = new Circle("red",0.5F);
		float[] sides = {1.0F,1.0F,1.0F}; 
		Triangle trin1 = new Triangle("blue",sides);
		sides = null;
		Square sqr1 = new Square("green",1.0F);
		System.out.println(circ1.area());
		System.out.println(trin1.area());
		System.out.println(sqr1.area());
	}
}
