package hw3;

import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		
		System.out.println("第二題:亂數產生0~9的數字後，進行猜數字遊戲");
		System.out.println("=======================");
		
		Scanner scanner = new Scanner(System.in);
		int random = (int)(Math.random()*10);
		
		System.out.println("開始猜數字吧!(0~9)");
		while(true) {
			int guest = scanner.nextInt();
			if(guest == random) {
				System.out.println("答對了!答案就是"+random);
				break;
			}
			System.out.println("猜錯囉");
		}
		System.out.println("第二題結束");
		System.out.println("=====================");
		
		
		System.out.println("第二題進階:0~100提示大小");
		random = (int)(Math.random()*101);
		
		System.out.println("開始猜數字吧!(0~100)");
		while(true) {
			int guest = scanner.nextInt();
			if(guest == random) {
				System.out.println("答對了!答案就是"+random);
				break;
			}else if(guest<random) {
				System.out.println("猜錯囉，答案比"+guest+"大");
			}else if(guest>random) {
				System.out.println("猜錯囉，答案比"+guest+"小");
			}

		}
		System.out.println("第二題進階結束");
		
		
		scanner.close();
	}
	
}
