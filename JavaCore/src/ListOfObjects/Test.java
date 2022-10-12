package ListOfObjects;

import java.util.ArrayList;

public class Test {
	
	
	public static void main(String[] args) {
		Product prod1=new Product("Bluetooth",50,10,"Boat");
		Product prod2=new Product("TV",1000,5,"Apple");
		Product prod3=new Product("Camera",500,8,"Sony");
		Product prod4=new Product("Tripod",70,15,"Digitech");
		ArrayList<Product> list=new ArrayList();
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(new Product("Lipstick",20,100,"Mac"));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).price>100 && list.get(i).quantity>5)
			{
				System.out.println(list.get(i));
			}
		}
		
		Product.getProduct(list);
		
	}
}

















