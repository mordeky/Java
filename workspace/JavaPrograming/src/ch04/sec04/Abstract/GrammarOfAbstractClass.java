package ch04.sec04.Abstract;

/**
  // 抽象类的定义
 abstract class <类名>{
	int a; // 可以有普通的成员变量;
	
	fun1() { 方法体 } // 可以有一般的成員方法
	abstract fun2( ); // 抽象方法，没有函数体，这将导致抽象类不能被直接实例化
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
	
	static abstract void funx(); // 成员方法，不能同时用static和abstract说明，

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

