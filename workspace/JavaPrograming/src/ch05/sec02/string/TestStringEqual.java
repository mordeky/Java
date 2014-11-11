package ch05.sec02.string;

public class TestStringEqual {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		Boolean x = a == b;
		Boolean y = c == d;
		
		return;
	}

}
