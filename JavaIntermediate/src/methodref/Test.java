package methodref;

public class Test {
	public static void main(String[] args) {
		School sch=new School();
		Noter nt=sch::NoteSomething;
		nt.note("friends");
	}
}
