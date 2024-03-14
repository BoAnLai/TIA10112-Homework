package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hw7_2 {

	public static void main(String[] args) {
		
		System.out.println("=== Hw7_2 亂數產生整數，並在txt檔裡儲存每次結果 ===");
		
		File outputFile = new File("C:\\data\\Data.txt");
		FileWriter myFW = null;
		PrintWriter myPW = null;
		
		try {

			outputFile.createNewFile();
			myFW = new FileWriter(outputFile,true);
			myPW = new PrintWriter(myFW);
			
			for(int i =0;i<10;i++) {
				int number = (int)(Math.random()*1000 + 1);
				myPW.print(number + "\t");
//				myPW.append(Integer.toString(number) + "\t");
			}
			myPW.println();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			if(myFW != null) {
				try {
					myFW.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(myPW != null) {
				myPW.close();
			}
		}
		
		System.out.println("=== complete ===");
		
	}
	
}
