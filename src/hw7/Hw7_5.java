package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

// 測試hw7_4是否正確寫入物件

public class Hw7_5{

	public static void main(String[] args) {
		
		System.out.println("=== 測試 hw7_4 是否正確寫入物件 ===");
		
		File inputFile = new File("C:\\data\\Object.ser");
		List<Object> container = new ArrayList<>();
		
		try(
			FileInputStream myFIS = new FileInputStream(inputFile);
			ObjectInputStream myOIS = new ObjectInputStream(myFIS);
		){
			
			while(true) {
				try {
					container.add(myOIS.readObject());					
				}catch(EOFException ee) {
					break;
				}
			}

			for(Object obj:container) {
				if(obj instanceof Cat) {
					((Cat)obj).speak();
				}else if(obj instanceof Dog) {
					((Dog)obj).speak();
				}		
			}

		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}

		
		System.out.println("=== main 結束 ===");
	}
	
}
