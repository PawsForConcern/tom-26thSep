package lambda;

public class Test {
	public static void main(String[] args) {
		Greeting gr = new Greeting() {
			public void greet() {
				System.out.println("ABC");
			}
		};
		gr.greet();
		Greeting gr1 =()->{System.out.println("Hello!");};
		gr1.greet();
	}
}
