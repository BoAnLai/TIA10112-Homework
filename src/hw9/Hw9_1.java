package hw9;

public class Hw9_1 {

	public static void main(String[] args) {
		
		System.out.println("=== Hw9_1 用2個執行緒模擬大胃王比賽 ===");
		System.out.println();
		System.out.println("-----大胃王快食比賽開始!-----");
		
		Player moon = new Player("Moon");
		Player james = new Player("James");
		
		EatingThread moonThread = new EatingThread(moon);
		EatingThread jamesThread = new EatingThread(james);
		
		moonThread.start();
		jamesThread.start();
		
		try {
			moonThread.join();
			jamesThread.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束!-----");
		
	}
	
}

class Player{

	private String name;
	public int count = 0;
	
	public Player() {};
	
	public Player(String name) {
		this.name = name;
	};
	
	public void eat(int goal) {
		try {
			Thread.sleep((int)(Math.random()*2501+500));			
		}catch(Exception e) {
			e.printStackTrace();
		}

		count += 1;
		System.out.println(this.name + "吃了第" + count + "碗飯");
		if(count == goal) {
			System.out.println(this.name + "吃完了!");
		}
	}
	
}

class EatingThread extends Thread{
	
	private Player player;
	final int GOAL = 10;
	
	public EatingThread(Player player) {
		this.player = player;
	}
	
	public void run() {
		while(player.count != GOAL) {
			player.eat(GOAL);
		}
	}
	
}