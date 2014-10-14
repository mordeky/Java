package ch04.sec07.exercise;

/**
 * ≤‚ ‘¿‡–Õ◊™ªª
 * 
 * @author Mordecai
 * 
 */

public class TestSupSubConversion {
	public void test1() {
		Person s1 = new Student();
		Person t1 = new Teacher();

		s1 = (Student) t1;
	}
	
	public void test2() {
		Student s2 = new Student();
		Teacher t2 = new Teacher();

		s2 = (Student) t2;
		s2.printInfo();
	}
	
	public void test3() {
		Person p = new Person();
		Student s = new Student();
		Teacher t = new Teacher();
		
		p.printInfo();
		
		p = s;
		p.printInfo();
		
		p = t;
		p.printInfo();
	}
	
	public static void main(String args[]) {
		TestSupSubConversion t = new TestSupSubConversion();
		t.test1();
		t.test2();
		t.test3();
	}
}
