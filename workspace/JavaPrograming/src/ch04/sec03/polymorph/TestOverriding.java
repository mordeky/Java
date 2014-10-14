package ch04.sec03.polymorph;

class Base {
	public void method() {
		System.out.println("Base.method()");
	}

	public static void play() {
		System.out.println("Base.play()");
	}
}

class Child extends Base {
	// public void method() {
	// System.out.println("TestOverriding.method()");
	// }

	/**
	 * 将会出现编译错误，因为： 方法覆盖的原则(1): 
	 *   子类方法的名称、参数签名和返回类型， 必须与其父类的方法的名称、参数签名和返回类型一致
	 */
	public int method() {
		System.out.println("Child.method()");
		return 0;
	}

	/**
	 * 将会出现编译错误，因为： 方法覆盖的原则(2): 
	 *   子类方法不能缩小父类方法的访问权限 
	 *   Cannot reduce the visibility of the inherited method from Base
	 */
	protected void method() {
		System.out.println("Child.method()");
	}

	public int method(int a) {
		System.out.println("Child.method(int a)");
		return 0;
	}

	/**
	 * 覆盖父类的静态方法
	 */
	public static void play() {
		System.out.println("Child.play()");
	}
}

public class TestOverriding {

	public static void main(String args[]) {
		Child a = new Child();
		a.method();
		a.method(0);
		a.play();
	}
}
