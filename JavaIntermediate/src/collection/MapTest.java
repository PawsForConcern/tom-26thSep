package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap();
		map.put(45326, "London");
		map.put(43605, "New York");
		map.put(54833, "Shanghai");
		map.put(65378, "Sidney");
		map.put(54727, "Istanbul");
		map.put(54727, "Constantinople");
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		Map<Integer,Product> map2 = new HashMap();
		Product prod1=new Product("Bluetooth",50,10,"Boat");
		Product prod2=new Product("TV",1000,5,"Apple");
		Product prod3=new Product("Camera",500,8,"Sony");
		Product prod4=new Product("Tripod",70,15,"Digitech");
		Product prod5=new Product("Camera",500,8,"Sony");
		Product prod6=new Product("Tripod",70,15,"Digitech");
		map2.put(1, prod1);
		map2.put(2, prod2);
		map2.put(3, prod3);
		map2.put(4, prod4);
		map2.put(5, prod5);
		map2.put(6, prod6);
		for (Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
	}
}
