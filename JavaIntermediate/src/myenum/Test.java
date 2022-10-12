package myenum;

public class Test {
	public static void main(String[] args) {
		Colours myColour=Colours.RED;
		System.out.println(myColour);
		MsgStatus mes = MsgStatus.READ;
		System.out.println(mes.getMsg());
	}
}
