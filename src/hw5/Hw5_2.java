package hw5;

public class Hw5_2 {

	public static void main(String[] args) {
	
		System.out.println("===Hw5_2===");
		System.out.println("用overloading取int及double兩種二維陣列的最大值");
		
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		
		System.out.println("int二維陣列的最大值: " + maxElement(intArray));
		System.out.println("double二維陣列的最大值: " + maxElement(doubleArray));
		
		
	}
	
	public static int maxElement(int[][] intArray) {
		
		int output = intArray[0][0];
		
		for(int i = 0; i< intArray.length;i++) {
			for(int elem:intArray[i]) {
				if(elem>output) {
					output = elem;
				}
			}
		}
		
		return output;
	}
	
	public static double maxElement(double[][] doubleArray) {
		
		double output = doubleArray[0][0];
		
		for(int i = 0; i< doubleArray.length;i++) {
			for(double elem:doubleArray[i]) {
				if(elem>output) {
					output = elem;
				}
			}
		}
		
		return output;
	}
	
	
}
