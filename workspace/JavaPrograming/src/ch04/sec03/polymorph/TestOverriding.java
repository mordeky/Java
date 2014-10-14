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
	 * ������ֱ��������Ϊ�� �������ǵ�ԭ��(1): 
	 *   ���෽�������ơ�����ǩ���ͷ������ͣ� �������丸��ķ��������ơ�����ǩ���ͷ�������һ��
	 */
	public int method() {
		System.out.println("Child.method()");
		return 0;
	}

	/**
	 * ������ֱ��������Ϊ�� �������ǵ�ԭ��(2): 
	 *   ���෽��������С���෽���ķ���Ȩ�� 
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
	 * ���Ǹ���ľ�̬����
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
