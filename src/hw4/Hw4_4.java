package hw4;

public class Hw4_4 {

	public static void main(String[] args) {
		
		System.out.println("第4題:給定8同學各自6次考試成績，計算並輸出每位同學考最高分的次數");
		
		int[][] test = {
				{10,37,100,77,98,90},
				{35,75,70,95,70,80},
				{40,77,79,70,89,100},
				{100,89,90,89,90,75},
				{60,64,75,60,75,50},
				{85,75,70,75,90,20},
				{75,70,79,85,89,99},
				{70,95,90,89,90,75}
		};
		
		int[] studentMax = {0,0,0,0,0,0,0,0};
		
		for(int i =0;i<6;i++) {
			int maxIndex = 0;
			
					
			for(int j = 1;j<8;j++) {
				if(test[maxIndex][i]<test[j][i]) {
					maxIndex = j;
				}
			}
			studentMax[maxIndex] += 1;
			
		}
		
		for(int i=0;i<8;i++) {
			System.out.println((i+1)+"號同學考最高分"+studentMax[i]+"次");
		}
		
	}
	
}
