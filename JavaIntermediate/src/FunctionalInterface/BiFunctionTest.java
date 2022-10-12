package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bif=(a,b)->(a*b);
		System.out.println(bif.apply(3, 4));
		
		BiFunction<String,String,String> bif1=(a,b)->("hello "+a+" and "+b);
		System.out.println(bif1.apply("Bill", "Ted"));
	}
}
