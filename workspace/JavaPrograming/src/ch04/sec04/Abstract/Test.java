package ch04.sec04.Abstract;

abstract class Base {
	abstract public void myfunc();

	public void another() {
		System.out.println("Another method");
	}
}

public class Test extends Base {
	public void myfunc() {
		System.out.println("One method");
	}

	public void amethod() {
		myfunc();
	}

	public static void main(String args[]) {
		Test a = new Test();
		a.amethod();
		a.another();
	}
}
