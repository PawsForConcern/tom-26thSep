package liskov;

public class TestLiskov {
	public static void main(String[] args) {
		Owl o = new Owl();
		o.setAltitude(0);
		Penguin p = new Penguin();
		p.setSpeed(0);
		Animal.learnToFly(o);
		System.out.println(o.getAltitude());
	}
}
   