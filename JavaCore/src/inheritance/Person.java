package inheritance;

public abstract class Person {
	String name;
	int age;
	public Person() {}
	public Person(String name,int age)
	{	
		this.name=name;
		this.age=age;
		System.out.println("Person contructor");
	}
	public abstract void doSomething(); //no method->must be defined by child
	public void talk()
	{
		System.out.println("People talk to each other to express their feeelings");
	}
	
	
}
