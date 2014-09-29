package ch04;

class Base {
	public void method() {
		System.out.println("Base.method()");
	}
}

public class TestOverriding extends Base {
//	public void method() {
//		System.out.println("TestOverriding.method()");
//	}
	
	/**
	 *  将会出现编译错误，因为：
	 *  方法覆盖的原则(1):
	 *    子类方法的名称、参数签名和返回类型，
	 *    必须与其父类的方法的名称、参数签名和返回类型一致
	 */
	public int method() {
		System.out.println("TestOverriding.method()");
		return 0;
	}
	
	/**
	 *  将会出现编译错误，因为：
	 *  方法覆盖的原则(2):
	 *    子类方法不能缩小父类方法的访问权限
	 *    Cannot reduce the visibility of the inherited method from Base
	 */
	protected void method() {
		System.out.println("TestOverriding.method()");
	}

	public int method(int a) {
		System.out.println("TestOverriding.method(int a)");
		return 0;
	}
	
	public static void main(String args[]) {
		TestOverriding a = new TestOverriding();
		a.method();
		a.method(0);
	}
}
