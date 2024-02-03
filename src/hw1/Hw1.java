package hw1;

public class hw1 {

	public static void main(String[] args) {
		
		System.out.println("第一題");
		System.out.println("12+6="+(12+6));
		System.out.println("12*6="+(12*6));
		
		
		System.out.println("\n第二題");
		int eggDozen = 200/12;
		int eggLeft = 200%12;
		System.out.println("200顆蛋一共"+eggDozen+"打"+eggLeft+"顆");
		
		
		System.out.println("\n第三題");
		int originSec = 256559;
		int sec = originSec%60;
		int min = originSec/60;
		int hr = min/60; //總分鐘分配給總小時
		min = min%60;	 //扣除進位給小時，剩下的分鐘數
		int day = hr/24; //總小時分配給總天數
		hr = hr%24;		 //扣除進位給天數，剩下的小時數
		System.out.println(originSec+"秒總共:"+day+"天"+hr+"小時"+min+"分鐘"+sec+"秒");
		
		
		System.out.println("\n第四題");
		final double PI = 3.1415;
		System.out.println("半徑為5的圓面積為"+(Math.pow(5,2)*PI)+"，周長為"+(5*2*PI));
		System.out.printf("使用printf輸出：半徑為5的圓面積為%.2f，周長為%.2f%n",(Math.pow(5,2)*PI),(5*2*PI));
		
		
		System.out.println("\n第五題");
		double saving = 1500000;
		double ratio = 1+0.02;
		for(int i=0;i<10;i++) {
			saving = saving*ratio;
		}
		int output = (int)saving;
		System.out.printf("150萬本金經過10年後本金加利息一共%d元%n",output);
		
		
		System.out.println("\n第六題");
		System.out.println(5+5); //一般的數學運算，印出10
		System.out.println(5+'5'); 
		//數字與字元相加時，字元轉換為Unicode編碼。
		//數字5的Unicode編碼為0x0035，相當於十進位的數字53，所以會印出58(5+53)
		System.out.println(5+"5");
		//數字與字串相加時，數字會轉換為字串後合併入字串。因此印出55。
	}
	
}
