package ch04.sec04.Abstract;

/**
  // ������Ķ���
 abstract class <����>{
	int a; // ��������ͨ�ĳ�Ա����;
	
	fun1() { ������ } // ������һ��ĳɆT����
	abstract fun2( ); // ���󷽷���û�к����壬�⽫���³����಻�ܱ�ֱ��ʵ����
}
*/

class Base1 {

	abstract public void fun1();

	public void fun2() {
		System.out.println("fun2()");
	}
}

abstract class Base2 {

	abstract public void fun1();
	
	static abstract void funx(); // ��Ա����������ͬʱ��static��abstract˵����

	public void funy() {
		System.out.println("fun2()");
	}
}

class GrammarOfAbstractClass01 extends Base1, Base2 {
	
	public static void main(String args[]) {
		Base2 b3;
		Base1 b1 = new Base1();
	}
}

public class GrammarOfAbstractClass extends Base2 {
	
	public static void main(String args[]) {
		Base2 b3;
		Base1 b1 = new Base1();
		Base2 b2 = new Base2();
	}
}

