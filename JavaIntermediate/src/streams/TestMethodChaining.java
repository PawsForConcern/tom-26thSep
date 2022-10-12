package streams;

public class TestMethodChaining {
	public static void main(String[] args) {
		new MethodChaining().getObject().addToX(10).msg().show();
	}
}
