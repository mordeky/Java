package ch04.sec07.exercise;


public class TestDyanmicPolymorph {
	public static void main(String args[]) {
		// ��̬��ʾ
		Person a = new Student();
		a.printInfo();
		
		Person b = new Teacher();
		b.printInfo();
	}
}
