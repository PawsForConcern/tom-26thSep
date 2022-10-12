package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<String,Integer> filter=(x,y)->{
			return x.length()==y;
		};
		System.out.println(filter.test("mkyong", 6));
		System.out.println(filter.test("java", 10));
	}
}
