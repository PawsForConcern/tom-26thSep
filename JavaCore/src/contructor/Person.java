package contructor;

public class Person {
	String name;
	int age;
	String address;
	int phone;
	
	public Person() {
		System.out.println("Person class instantiated");
	}
	
	public Person(String name, int age, String address, int phone) {
		this.name=name;
		if(age<=0)
		{
			System.out.println("age can not be less than 0");
		}
		else{
			this.age=age;
		}
		this.address=address;
		this.phone=phone;
	}
	public Person(String n, int a) {
		name=n;
		if(a<=0)
		{
			System.out.println("age can not be less than 0");
		}
		else{
			age=a;
		}
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + "]";
	}	
}
