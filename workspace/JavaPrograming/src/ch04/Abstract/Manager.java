package ch04.Abstract;

abstract class Employee {
	abstract void raiseSalary(int i);
}

public class Manager extends Employee {
	void raiseSalary(int i) {
	}
	
	public static void main(String args[]) {
		// �������ɳ�����ı��������ñ�������ָ������һ�������ʵ��
		Employee e1 = new Manager();
		Employee e2 = new Employee();
	}
}
