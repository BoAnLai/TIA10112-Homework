package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Hw8_2 {

	public static void main(String[] args) {
		
		System.out.println("=== Hw8_2 設計Train類別，並將多個物件儲存進Collection練習操作 ===");
		
		HashSet<Train> mySet = new HashSet<Train>();
		TreeSet<Train> myTree = new TreeSet<Train>();
		ArrayList<Train> myList = new ArrayList<Train>();
	
		Train[] inputArr = {
			new Train(202,"普悠瑪","樹林","花蓮",400),
			new Train(1254,"區間","屏東","基隆",700),
			new Train(118,"自強","高雄","台北",500),
			new Train(1288,"區間","新竹","基隆",400),
			new Train(122,"自強","台中","花蓮",600),
			new Train(1222,"區間","樹林","七堵",300),
			new Train(1254,"區間","屏東","基隆",700)
		};
		

		
		System.out.println("=== 印出不重複的Train ===");
		System.out.println("使用HashSet Train@Override .equals及.hashCode");

		for(Train t:inputArr) {
			mySet.add(t);
		}
		
		for(Train t:mySet) {
			System.out.println(t);
		}
		
		System.out.println("=== 印出由大到小排列的Train ===");
		System.out.println("使用ArrayList.sort()");
		
		for(Train t:inputArr) {
			myList.add(t);
		}		
		
		myList.sort(null);
		
		Iterator<Train> iter = myList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=== 印出由大到小排列且不重複的Train ===");
		System.out.println("使用TreeSet Train@Override .compareTo");

		for(Train t:inputArr) {
			myTree.add(t);
		}
		
		Object[] tempArr = myTree.toArray();
		
		for(int i = 0;i< myTree.size();i++) {
			System.out.println(tempArr[i]);
		}
	}
	
}

class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train() {};
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		String output = "[Train]班次:"+this.number+"\t車種:"+this.type+"\t出發地:"+this.start+"\t目的地:"+this.dest+"\t票價:"+this.price;
		return output;
	}
	
	@Override
	public int compareTo(Train t) {
		if(this.number > t.number) {
			return -1;
		}else if(this.number<t.number) {
			return 1;
		}else{
			return 0;
		}
	}
	
}
