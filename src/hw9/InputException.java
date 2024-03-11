package hw9;

public class InputException extends IllegalArgumentException{

	public InputException() {};
	
	public InputException(String msg) {
		super(msg);
		System.out.println(msg);
	}
}
