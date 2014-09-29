package ch03;

public class Student {
	String name;
	public int stuID;
	private char sex;
	protected int age;

	public Student() {
	}

	public Student(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public Student(String stuName, char sex, int stuID) {
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}

	public void setName(String stuName) {
		name = stuName;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public static void main(String args[]) {
		Student[] s = new Student[30];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
		}
	}
}



