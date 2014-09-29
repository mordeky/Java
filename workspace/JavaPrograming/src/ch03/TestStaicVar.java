package ch03;

public class TestStaicVar {
	private static class Student {
		String name;
		int age;
		public static int totalNumber = 0; // ѧ��������
		
		public Student(int age, String name) {
			this.name = name;
			this.age = age;
			totalNumber++;
		}
		
		public void printMotto() {
			System.out.println(name + ": I have a dream.");
		}
		
		public static void statTotalNumber( ){
	        System.out.println( "ѧ���������ǣ�" + totalNumber);
	    }
	}
	
	public static void main(String args[]) {
		Student a = new Student(15, "Tommy");
		a.printMotto();
		
		Student b = new Student(15, "Rose");
		b.printMotto();
		
		Student.statTotalNumber();
	}
}
