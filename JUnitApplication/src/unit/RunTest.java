package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test
	public void runFindBiggest() {
		int[] arr = {10,20,15};
		assertEquals(20,Calculator.findBiggest(arr));
	}
}
