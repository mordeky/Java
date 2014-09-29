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
	 *  ������ֱ��������Ϊ��
	 *  �������ǵ�ԭ��(1):
	 *    ���෽�������ơ�����ǩ���ͷ������ͣ�
	 *    �������丸��ķ��������ơ�����ǩ���ͷ�������һ��
	 */
	public int method() {
		System.out.println("TestOverriding.method()");
		return 0;
	}
	
	/**
	 *  ������ֱ��������Ϊ��
	 *  �������ǵ�ԭ��(2):
	 *    ���෽��������С���෽���ķ���Ȩ��
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
