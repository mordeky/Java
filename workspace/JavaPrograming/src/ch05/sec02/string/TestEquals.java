package ch05.sec02.string;

//程序5-5 TestEquals.java
class TestClass {
	int x = 1;
}

public class TestEquals {
	public static void print(String s) {
		print(s);
	}

	public static void main(String args[]) {
		TestClass One = new TestClass();
		TestClass Two = new TestClass();

		String a1, a2, a3 = "abc", a4 = "abc";
		a1 = new String("abc");
		a2 = new String("abc");

		print("a1.equals(a2) 是 " + (a1.equals(a2))); // 输出________
		print("a1==a2 是 " + (a1 == a2)); // 输出________
		print("a1.equals(a3) 是 " + (a1.equals(a3))); // 输出_________
		print("a1==a3 是 " + (a1 == a3)); // 输出_________
		print("a3.equals(a4) 是 " + (a3.equals(a4))); // 输出_________
		print("a3==a4 是 " + (a3 == a4)); // 输出_________
		print("One.equals(Two) 是 " + (One.equals(Two))); // 输出________
		print("One==Two 是 " + (One == Two)); // 输出___________

		One = Two;
		print("赋值后，One.equals(Two) 是 " + (One.equals(Two))); // 输出_______
		print("赋值后，One==Two 是 " + (One == Two)); // 输出________
	}
}
