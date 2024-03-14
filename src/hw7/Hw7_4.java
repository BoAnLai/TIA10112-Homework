package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw7_4 {

	public static void main(String[] args) {
		
		System.out.println("=== Hw7_4 將java物件儲存到.ser檔 ===");
		System.out.println();
		
		File output = new File("C:\\data\\Object.ser");
		
		try(
				
			FileOutputStream myFOS = new FileOutputStream(output);
			ObjectOutputStream myOOS = new ObjectOutputStream(myFOS);
		){
			output.createNewFile();
			
			Dog akita = new Dog("akita");
			Dog pug = new Dog("pug");
			Cat calico = new Cat("calico");
			Cat tabby = new Cat("tabby");
			
			Object[] arr = {akita, pug, calico, tabby};
			
			for(Object obj:arr) {
				myOOS.writeObject(obj);
			}
			
			
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		
		
		
		System.out.println();
		System.out.println("=== main結束 ===");
	}
	
}
