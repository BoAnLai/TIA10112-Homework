package hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw7_3 {

	public static void main(String[] args) {
		System.out.println("=== Hw7_3 複製檔案 ===");
		
		String inputFilePath = "C:\\data\\Sample.txt";
		String outputFilePath = "C:\\data\\SampleOutput2.txt";
		
		copyFile(inputFilePath, outputFilePath);
		
		System.out.println("=== 完成檔案複製 ===");
	}
	
	
	public static void copyFile(String copyFromFile, String copyToFile) {
		
		File source = new File(copyFromFile);
		File destination = new File(copyToFile);
		
		try(
			FileReader myFR = new FileReader(source);
			FileWriter myFW = new FileWriter(destination);
//			PrintWriter myPW = new PrintWriter(myFW);
			){
			
			int readInt;
			while((readInt = myFR.read()) != -1) {
				myFW.write(readInt);
			}
			
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}
