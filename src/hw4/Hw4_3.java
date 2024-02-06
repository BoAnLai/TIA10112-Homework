package hw4;

import java.util.Scanner;

public class Hw4_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("第3題:輸入yyyy年mm月dd日共3個整數，計算並輸出該天是該年的第幾天。");
		
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int year,month,day;
		do {
			System.out.print("請輸入年份(西元):");
			year = scanner.nextInt();
		}while(!(checkYear(year)));
		
		do {
			System.out.print("請輸入月份:");
			month = scanner.nextInt();
		}while(!(checkMonth(month)));
		
		do {
			System.out.print("請輸入日期:");
			day = scanner.nextInt();
		}while(!(checkDay(year,month,day,monthDays)));
		
		
		System.out.println("==================");
		System.out.println("你輸入了"+"西元"+year+"年"+month+"月"+day+"日");
		System.out.println("是閏年:"+checkLeapyear(year));
		
		int outputDay = 0;
		for(int i =0;i<month;i++) {
			outputDay += monthDays[i];
		}
		outputDay += day;
		if(checkLeapyear(year) && month > 2) {
			outputDay+=1;
		}
		
		System.out.println("==================");
		System.out.println("輸入的日期為該年第"+outputDay+"天");

		
		scanner.close();
	}
	
	
//	===閏年規則===
//	微軟:https://learn.microsoft.com/zh-tw/office/troubleshoot/excel/determine-a-leap-year
//	
//	1.被4整除移至步驟2，無法整除是平年
//	2.被100整除移至步驟3，無法整除是閏年
//	3.被400整除是閏年，無法整除是平年
//	平年2月28天，閏年2月29天
	public static boolean checkLeapyear(int year) {

		boolean isLeapyear;
		if(year%4!=0) {
			isLeapyear = false;
		}else if(year%100!=0) {
			isLeapyear = true;
		}else if(year%400 ==0) {
			isLeapyear = true;
		}else {
			isLeapyear = false;
		}
		
		return isLeapyear;
	}
	
	public static boolean checkYear(int year) {
		if(year<=0) {
			System.out.println("年份應為正整數");
			return false;
		}
		return true;
	}
	
	public static boolean checkMonth(int month) {
		if(month<=0) {
			System.out.println("月份應為正整數");
			return false;
		}else if(month>12) {
			System.out.println("月份應介於1~12");
			return false;
		}
		return true;
	}
	
	public static boolean checkDay(int year, int month, int day, int[] monthDays) {
		if(day<=0) {
			System.out.println("日期應為正整數");
			return false;
		}
		
		if(month == 2) {
			if(checkLeapyear(year)&&day>29) {
				System.out.println("日期不應超過29");
				return false;
			}else if(!(checkLeapyear(year)) && day>28) {
				System.out.println("日期不應超過28");
				return false;
			}
		}else {
			if(day>monthDays[month]) {
				System.out.println("日期不應超過"+monthDays[month]);
				return false;
			}			
		}
		return true;
	}
}
