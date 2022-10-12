package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("D:\\qafiles\\test.txt");
			String content="test test test";
			w.write(content);
			w.close();
			System.out.println("File written successfully");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
