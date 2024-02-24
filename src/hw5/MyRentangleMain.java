package hw5;

public class MyRentangleMain {

	public static void main(String[] args) {
		
		System.out.println("===Hw3_3===");
		System.out.println("第一個三角形: ");
		MyRectangle rectangle = new MyRectangle();
		rectangle.setWidth(10);
		rectangle.setDepth(20);
		System.out.println("面積為: " + rectangle.getArea());
		
		System.out.println();
		
		System.out.println("第二個三角形: ");
		MyRectangle rectangle2 = new MyRectangle(10,20);
		System.out.println("面積為: "+rectangle2.getArea());
	}
	
}
