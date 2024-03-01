package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void powerXY() throws Exception{

		Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			
			System.out.println("請輸入y的值:");
			int y = sc.nextInt();
			
			if(x == 0 && y == 0) {
				throw new CalException("0的0次方沒有意義!");
			} else if (y<0) {
				throw new CalException("次方為負值，結果回傳不為整數!");
			} else {
				int output = (int)Math.pow(x, y);
				System.out.println(x+"的"+y+"次方等於"+output);
			}	
		}catch(CalException e){
			System.out.println(e.getMessage());
			powerXY();
		}catch(InputMismatchException e){
			System.out.println("輸入格式不正確");
			powerXY();
		}finally {
			sc.close();
		}	
	}	
}