package hw3;

import java.util.Scanner;

public class Hw3_1 {

	public static void main(String[] args) {
		
		System.out.println("第一題：請輸入三個整數，驗證是否能組成三角形(三角形類型)");
		System.out.println("==============================");
		
		Scanner scanner = new Scanner(System.in);
		
		int[] input = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		if(input[0]>=input[1]+input[2] || input[1]>=input[0]+input[2] ||input[2]>=input[0]+input[1]) {
			System.out.println("不是三角形");
		}else if(input[0]==input[1]&&input[1]==input[2]) {
			System.out.println("正三角形");
		}else if(input[0] == input[1] || input[1] ==input[2] ||input[0]==input[2]) {
			System.out.println("等腰三角形");
		}else {
			System.out.println("其它三角形");
		}
			
		scanner.close();
	}
	
	
}
