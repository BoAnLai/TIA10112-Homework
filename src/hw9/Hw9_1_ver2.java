package hw9;

public class Hw9_1_ver2 {

	public static void main(String[] args) {
		
		System.out.println("===== Hw9_1_ver2 用2個執行緒模擬大胃王比賽 =====");
		System.out.println();
		
		PlayerThread moon = new PlayerThread("饅頭人");
		PlayerThread james = new PlayerThread("詹姆士");
		
		moon.start();
		james.start();
		
		try {
			moon.join();
			james.join();			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束!-----");
	}
}

class PlayerThread extends Thread{
	
	private String name;
	
	public PlayerThread() {
		this.name = "nobody";
	};
	
	public PlayerThread(String name) {
		this.name = name;
	}
	
	public void run() {
		
		int total = 0;
		
		for(int i = 0;i<10;i++) {
			
			int timeSpend = (int)(Math.random()*2501)+500;
			total += timeSpend;
			try {
				Thread.sleep(timeSpend);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(this.name + "吃第" + (i+1) + "碗飯，花了"+timeSpend+"毫秒");
			if(i==9) {
				System.out.println(this.name + "吃完了! 共花費" + total +"毫秒");
			}
		}
	}
}