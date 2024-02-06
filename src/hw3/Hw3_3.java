package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("第三題:阿文又在簽大樂透");
		System.out.println("===============");
		
		System.out.println("阿文...請輸入你討厭哪個數字?(0~9)");
		int input = scanner.nextInt();
		System.out.println("===============");
		
		int[] arr = new int[49];
		for(int i = 0;i<49;i++) {
			arr[i] = i+1;
		}
		
		
		if(input == 0) {
			for(int i =0;i<49;i++) {
				if(arr[i]%10 ==input) {
					arr[i] = 0;
				}
			}
		}else {
			for(int i = 0;i<49;i++) {
				if(arr[i]%10==input ||arr[i]/10 == input) {
					arr[i] = 0;
				}
			}			
		}		
			
		
//		換行用
		int count = 0;
		
		for(int i = 0;i<49;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+"\t");
				count += 1;
			}
			if(count == 5) {
				System.out.println();
				count = 0;
			}	
		}

		
		int[] printIndexArr = {0,0,0,0,0,0};
		
		System.out.println();
		System.out.println("=============");
		System.out.println("隨機印出其中六個號碼");

		int count2 =0;
		while(count2<6) {
			int printIndex = (int)(Math.random()*arr.length);
//				檢查是否已存在checkNoRepeat[]
			for(int i =0;i<printIndexArr.length;i++) {			
//					若存在，重新抽取隨機值
				if(printIndex == printIndexArr[i]) {
					break;
//					若檢查完所有元素，確定皆不存在，且其值不為0，則傳入清單中等待印出
				}else if(i==printIndexArr.length-1) {
					if(arr[printIndex]!=0) {
						printIndexArr[count2]=printIndex;
						count2 += 1;
					}
				}
			}
		}
		
		Arrays.sort(printIndexArr);
		
		for(int i = 0;i<6;i++) {
			System.out.print(arr[printIndexArr[i]]+"\t");
		}
		
		scanner.close();
	}
}
