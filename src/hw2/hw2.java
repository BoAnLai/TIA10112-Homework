package hw2;

public class hw2 {

	public static void main(String[] args) {
		
		System.out.println("第一題: 計算1至1000的偶數和");
		int output1 = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%2==0) {
				output1+=i;
			}
		}
		System.out.println("總合為"+output1);
		
		
		System.out.println("\n第二題: 計算1至10的連乘積，用for迴圈");
		int output2 = 1;
		for(int i =1;i<=10;i++) {
			output2 *= i;
		}
		System.out.println("連乘積為"+output2);
		
		
		System.out.println("\n第三題: 計算1至10的連乘積，用while迴圈");
		int output3 = 1;
		int tmp3 = 1;
		while(tmp3<=10) {
			output3 *=tmp3;
			tmp3 = tmp3+1;
		}
		System.out.println("連乘積為"+output3);
		
		
		System.out.println("\n第四題: 輸出1至10的平方");
		for(int i = 1;i<=10;i++) {
			System.out.print((int)(Math.pow(i,2))+" ");
		}
		System.out.println();
		
		
		System.out.println("\n第五題: 阿文的大樂透，輸出1~49中不含數字4的數字");
		for(int i = 1;i<=49;i++) {
			if(i%10==4 || i/40>=1) {
				continue;
			}	
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		System.out.println("\n第六題: 輸出倒立的數字三角形");
		for(int i = 10;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n第七題: 輸出A~F的三角形");
		for(int i = 1;i<=6;i++) {
			int tmp7 = 0x0041 + i; 			//A unicode為0x0041，即65。
			char outputChar7 = (char)tmp7;
			for(int j = 1;j<=i;j++) {
				System.out.print(outputChar7);
			}
			System.out.println();
		}
		
		
		System.out.println("\n第?題: 印出99乘法表");
		for(int i = 1;i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
			
		}
		
	}
	
}
