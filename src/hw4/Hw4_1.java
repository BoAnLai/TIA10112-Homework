package hw4;

import java.util.Scanner;

public class Hw4_1 {

	public static void main(String[] args) {

		System.out.println("第1-1題:給定整數一維陣列，輸出所有元素的平均值及大於平均值的元素");

		int[] arr1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		double sum = 0;
		double avg;

		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		avg = sum/arr1.length;
		System.out.print("平均值:");
		System.out.println(avg);
		
		System.out.print("大於平均值的元素:");
		for(int elem:arr1) {
			if(elem>avg) {
				System.out.print(elem+"\s");
			}
		}
		

		
		System.out.println("\n==========================\n");
		System.out.println("第1-2題:輸入一字串，並印出反過來的字串");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一字串:");
		String input2 = scanner.nextLine().trim();
		
		System.out.print("反過來的字串:");
		for(int i = input2.length()-1;i>=0;i--) {
			System.out.print(input2.charAt(i));
		}
		
		scanner.close();
		
		
		
		System.out.println("\n==========================\n");
		System.out.println("第1-3題:給定字串陣列，計算出共有多少母音(a,e,i,o,u)");
		
		String[] arr3 = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		int[] count3 = {0,0,0,0,0};
		
		System.out.print("字串陣列:");
		for(String elem:arr3) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		for(int i = 0;i<arr3.length;i++) {
			for(int j = 0;j<arr3[i].length();j++) {
				switch(arr3[i].charAt(j)) {
					case 'a':
						count3[0] += 1;
						break;
					case 'e':
						count3[1] += 1;
						break;
					case 'i':
						count3[2] += 1;
						break;
					case 'o':
						count3[3] += 1;
						break;
					case 'u':
						count3[4] += 1;
						break;
				}
			}
		}
		System.out.println("共有"+count3[0]+"個a");
		System.out.println("共有"+count3[1]+"個e");
		System.out.println("共有"+count3[2]+"個i");
		System.out.println("共有"+count3[3]+"個o");
		System.out.println("共有"+count3[4]+"個u");
	}
}
