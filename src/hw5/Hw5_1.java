package hw5;
import java.util.Scanner;


public class Hw5_1 {

	public static void main(String[] args) {
		System.out.println("===Hw5_1===");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width =	scanner.nextInt();
		int height = scanner.nextInt();
		starSquare(width,height);
		scanner.close();
		
		System.out.println("======");
		
		randAvg();
	}
	
	public static void starSquare(int width, int height) {

		for(int i = 0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void randAvg() {
		System.out.println("印出10個介於0~100的亂數，並取其平均值");
		double[] arr = new double[10];
		double avg = 0;
		
		for(int i = 0;i<10;i++) {
			arr[i] = Math.ceil(Math.random()*101);
			avg += arr[i]/10;
		}
		
		
		for(double elem:arr) {
			System.out.print(elem+ " ");
		}
		System.out.println();
		System.out.println("平均值為:"+avg);
		
	}
	
}
