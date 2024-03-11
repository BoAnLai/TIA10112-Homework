package hw6;

public class CalTest {

	public static void main(String[] args) {
		try {
			Calculator.powerXY();
		} catch (Exception e) {
			System.out.println("== 進入main catch ==");
			System.out.println(e);
		}

	}

}
