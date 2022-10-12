package unit;

public class Calculator {
	public static int findBiggest(int[] ints) {
		if (ints.length==1) {
			return ints[0];
		}
		int t = ints[0];
		for (int i=0;i<ints.length;i++) {
			if (ints[i]>t) {
				t=ints[i];
			}
		}
		return t;
	}
}
