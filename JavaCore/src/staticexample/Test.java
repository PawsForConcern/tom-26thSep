package staticexample;

public class Test {
	public static void main(String[] args) {
		MySample obj1=new MySample();
		obj1.x=10;
		System.out.println(obj1.x);
		obj1.x++;
		System.out.println(obj1.x);
		System.out.println(MySample.staticX++);
		System.out.println(MySample.staticX++);
		
		MySample obj2=new MySample();
		obj2.x=20;
		System.out.println(obj2.x);
		obj2.x++;
		System.out.println(obj2.x);
		System.out.println(MySample.staticX++);
		
		MySample obj3=new MySample();
		System.out.println(MySample.staticX++);
	}
}
