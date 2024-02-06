package hw4;

import java.util.Scanner;

public class Hw4_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("第2題:給定同事5人員工編號及身上現金，輸入欲借金額後，輸出可借錢的同事。");
		System.out.println("=======================");
		int[][] colleague = {
				{25,32,8,19,27},
				{2500,800,500,1000,1200}
		};
		
		System.out.print("請輸入想借的金額:");
		int input = scanner.nextInt();
		System.out.println();
		
		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		for(int i =0;i<colleague[1].length;i++) {
			if(colleague[1][i]>=input) {
				System.out.print(colleague[0][i]+" ");
				count+=1;
			}
		}
		System.out.println("，共"+count+"人!");
		
		scanner.close();
	}
	
}
