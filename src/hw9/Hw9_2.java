package hw9;

public class Hw9_2 {

	public static void main(String[] args) {
		
		System.out.println("===== Hw9_2 模擬兩個執行緒之間的溝通 =====");
		System.out.println();
		
		Account bearAccount = new Account();
		
		BearThread bearThread = new BearThread("熊大",bearAccount);
		BearmomThread bearmomThread = new BearmomThread("媽媽",bearAccount);
		
		bearThread.start();
		bearmomThread.start();
		
		try {
			bearThread.join();
			bearmomThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("main thread 結束");
		}
		
	}
}

class Account {
	
	private int money; 
	
	public Account() {
		this.money = 0;
	}
	
	public Account(int money) {
		this.money = money;
	}
	
	synchronized public void takeMoney(String name, int money){
		
		if(this.money<money) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.money = this.money - money;
		System.out.println(name+"領了" + money+"，帳戶共有:"+this.money);
		
		if(this.money == 0) {
			System.out.println(name+"看到帳戶沒錢，暫停提款");
			try {
				wait();
				System.out.println(name+"被媽媽告知帳戶已經有錢!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(this.money<2000) {
			System.out.println(name+"看到餘額在2000以下，要求匯款");
			notify();
		}
	}
	
	synchronized public void saveMoney(String name,int money) {
		this.money += money;
		System.out.println(name + "存了" + money + "，帳戶共有" + this.money);
		notify();
		
		if(this.money> 3000) {
			System.out.println(name + "看到餘額在3000以上，暫停匯款");
			try {
				wait();
				System.out.println(name + "被熊大要求匯款!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("saveMoney失敗");
			}
		}
	}
}

