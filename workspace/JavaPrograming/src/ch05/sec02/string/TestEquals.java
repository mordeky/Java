package ch05.sec02.string;

//����5-5 TestEquals.java
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

		print("a1.equals(a2) �� " + (a1.equals(a2))); // ���________
		print("a1==a2 �� " + (a1 == a2)); // ���________
		print("a1.equals(a3) �� " + (a1.equals(a3))); // ���_________
		print("a1==a3 �� " + (a1 == a3)); // ���_________
		print("a3.equals(a4) �� " + (a3.equals(a4))); // ���_________
		print("a3==a4 �� " + (a3 == a4)); // ���_________
		print("One.equals(Two) �� " + (One.equals(Two))); // ���________
		print("One==Two �� " + (One == Two)); // ���___________

		One = Two;
		print("��ֵ��One.equals(Two) �� " + (One.equals(Two))); // ���_______
		print("��ֵ��One==Two �� " + (One == Two)); // ���________
	}
}
