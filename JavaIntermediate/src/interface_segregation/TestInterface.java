package interface_segregation;

public class TestInterface {
	public static void main(String[] args) {
		Dodo d = new Dodo(0);
		Falcon f = new Falcon(0);
		d.goExtinct();
		System.out.println(d.getCurrentLocation());
		f.setCurrentLocation("In the air");
		System.out.println(f.getCurrentLocation());
	}
}
