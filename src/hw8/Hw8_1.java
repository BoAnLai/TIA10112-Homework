package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Hw8_1 {

	public static void main(String[] args) {

		System.out.println("=== hw8_1 建立並操作Collection物件 ===");

		ArrayList<Object> myList = new ArrayList<Object>();

		Object[] arr = { new Integer(100), new Double(3.14), new Long(21L), new Short("100"), new Double(5.1), "Kitty",new Integer(100), new Object(), "Snoopy", new BigInteger("1000")};

		for(Object obj: arr) {
			myList.add(obj);
		}
		
		Iterator<Object> myIterator = myList.iterator();
		
		System.out.println();
		System.out.println("=== print every elements in Collections ===");
		System.out.println("=== print out by iterator ===");
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		System.out.println("=== print out by traditional for loop===");
		for(int i = 0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("=== print out by foreach ===");
		for(Object obj:myList) {
			System.out.println(obj);
		}
		
		
		System.out.println();
		System.out.println("=== print Collection after remove elements not belong java.lang.Number===");
		
//		remove elements not java.lang.Number
		ArrayList<Object> waitForRemove = new ArrayList<Object>();
		for(Object obj:myList) {
			if(!(obj instanceof java.lang.Number)) {
				waitForRemove.add(obj);
			}
		}
		
		for(Object obj:waitForRemove) {
			myList.remove(obj);
		}
		
		for(Object obj:myList) {
			System.out.println(obj);
		}
		
		System.out.println("=== end ===");
	}

}
