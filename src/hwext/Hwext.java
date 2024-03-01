package hw6;

public class Hw6 {

	public static void main(String[] args) {
		
		System.out.println("===Hw6===");
		System.out.println("實作Pencil及InkBrush子類別，分別繼承抽象類別Pen");
		System.out.println();
		
		Pen[] arr = new Pen[2];
		arr[0] = new Pencil("PILOT",20);
		arr[1] = new InkBrush("LAMY",700);
		System.out.println();
		
		for(Pen elem:arr) {
			elem.write();
		}
		System.out.println();
		
		for(Pen elem:arr) {
			System.out.println("售價為: " + elem.getPrice());
		}
		
	}
}



abstract class Pen{
	private String brand;
	private int price;
	
	public Pen() {
		System.out.println("如果印出了此行文字，代表程式錯誤，請檢查建構子");
	}
	
	public Pen(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	abstract void write();
}



class Pencil extends Pen {
	
	public Pencil(String brand, int price) {
		super(brand,price);
		System.out.println("你設定Pencil的廠牌為: " + brand);
		System.out.println("定價為: " + price);
	}
	
	@Override
	void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public int getPrice() {
		System.out.println("Pen實際價格為定價的8折");
		return (int) Math.round(super.getPrice()*0.8);
	}
}



class InkBrush extends Pen{
	
	public InkBrush(String brand, int price) {
		super(brand,price);
		System.out.println("你設定InkBrush的廠牌為: " + brand);
		System.out.println("定價為: " + price);
	}
	
	@Override
	void write() {
		System.out.println("沾墨水再寫");
	}
	
	public int getPrice() {
		System.out.println("InkPrice實際價格為定價的9折");
		return (int) Math.round(super.getPrice()*0.9);
	}
}