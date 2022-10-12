package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Product prod=new Product(1001,"TV",1000,"Apple");
		try {
			FileOutputStream fileOut=new FileOutputStream("D:\\qafiles\\test2.txt");
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			oOut.writeObject(prod);
			FileInputStream fileIn=new FileInputStream("D:\\qafiles\\test2.txt");
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			Product prodCopy=(Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.brand);
			System.out.println(prodCopy.price);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
