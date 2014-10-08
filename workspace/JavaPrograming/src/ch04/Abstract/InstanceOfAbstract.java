package ch04.Abstract;

abstract class Employee {
	abstract void raiseSalary(int i);
}

public class InstanceOfAbstract extends Employee {
	void raiseSalary(int i) {
	}
	
	public static void main(String args[]) {
		// 可以生成抽象类的变量，但该变量必须指向具体的一个子类的实例
		Employee e1 = new InstanceOfAbstract();
		Employee e2 = new Employee();
	}
}
