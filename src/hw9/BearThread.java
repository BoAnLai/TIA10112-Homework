package hw9;

public class BearThread extends Thread{
	private String name;
	private Account account;
	
	public BearThread() {}
	
	public BearThread(String name,Account account) {
		this.name = name;
		this.account = account;
	}
	
	public void run() {
		for(int i = 0;i<10;i++) {
//			System.out.println("=== "+name + "第"+(i+1)+"次行動 ===");
			this.account.takeMoney(name,1000);
		}
		System.out.println("=== bearthread 結束 ===");
	}
}

class BearmomThread extends Thread{
	
	private String name;
	private Account account;
	
	public BearmomThread() {}
	
	public BearmomThread(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	public void run() {
		for(int i = 0;i<10;i++) {
//			System.out.println("=== "+name + "第"+(i+1)+"次行動 ===");
			this.account.saveMoney(name,2000);
		}
		System.out.println("=== momthread 結束 ===");
	}
}