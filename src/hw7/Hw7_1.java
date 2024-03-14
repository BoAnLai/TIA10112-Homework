package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


// 讀取到的字元數量比txt檔案少10個，列數少1(檔案最後一列沒有讀)。
//BufferReader及LineNumberReader讀取出來的結果一樣
public class Hw7_1 {

	public static void main(String[] args) {
		
//		LineNumberReader myLNR = null;
		BufferedReader myBR = null;
		
		try {
			System.out.println("=== Hw7_1 讀取txt檔案，輸出檔案基本資訊 ===");
			System.out.println();
			
			File myFile = new File("C:\\Users\\T14 Gen 3\\Downloads\\JAVA 吳冠宏老師\\作業題目\\hw7\\Sample.txt");
			
			FileReader myFR = new FileReader(myFile);
//			myLNR = new LineNumberReader(myFR);
			myBR = new BufferedReader(myFR);
			
			long b = myFile.length();
			int c = 0;
			int l = 0;
			
			while(true) {
//				String input = myLNR.readLine();
				String input = myBR.readLine();
				if(input ==null) {
					break;
				}else {
					c += input.length();
					l += 1 ;
					System.out.println(input);
				}
			}
			
			System.out.println();
			System.out.println("Sample.txt檔案共有 "+ b +" 個位元組，"+c+" 個字元，"+l+" 列資料");
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
//			if(myLNR != null) {
//				try {
//					myLNR.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			
			if(myBR != null) {
				try {
					myBR.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
		
	}
	
}
