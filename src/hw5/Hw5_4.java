package hw5;

public class Hw5_4 {

	public static void main(String[] args) {
		System.out.println("===Hw5_4===");
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(getAuthCode());
		
	}
	
	public static String getAuthCode() {
		String output = "";
		
		for(int i = 0;i<8;i++) {
			
			int random = getRandomInt();
			int getUnicode = 0;

		//  數字\u0030 - \u0039
		//  英文字母大寫\u0041 - \u005a
		//  英文字母小寫\u0061 - \u007a
			
			if(random>0 && random <=10) {
				 getUnicode = 0x30 - 1 + random;
			} else if (random > 10 && random <= 36) {
				getUnicode = 0x41 - 1 + random - 10;
			} else if (random > 36 && random <= 62) {
				getUnicode = 0x61 - 1 + random -36;
			} else {
				System.out.println("=== something wrong happen in getRandomInt()'s numeric range  ===");
			}
			
			 output += Character.toChars(getUnicode)[0];
		}
		
		return output;
	}
	
//  隨機取數字1~62 (10+26+26)
	public static int getRandomInt(){
		int output = (int)Math.ceil(Math.random()*62);
		return output;
	}
}