package exception;

public class ErrorChain {
	public static void method1() {
		int x=0;
		int y=0;
		int z=x/y;
	}
	public static void method2() {method1();}
	public static void method3() {method2();}
	public static void method4() {method3();}
	public static void method5() {method4();}

}
