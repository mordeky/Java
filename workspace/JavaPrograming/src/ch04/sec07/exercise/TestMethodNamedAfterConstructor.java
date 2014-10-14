package ch04.sec07.exercise;
class Test {
	public Test() {
		System.out.print(3);
	}
	
	public void Test() {
		System.out.print(2);
	}
}

public class TestMethodNamedAfterConstructor {
	public static void main(String[] args) {
		Test t = new Test();
		t.Test();
		System.out.print(1);
	}
}
