package staticexample;

public class MySample {
	int x;
	static int staticX=100; //static variables are defined for a class, not an instance, but can be changed unless "final"
	
	public MySample() {
		staticX++;
	}
	
	

}
