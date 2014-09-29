package ch04;

public class People {
	String name;
	char sex;
	private int age;

	public People() {
		System.out.println("People() is called.");
	}

	public People(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		System.out.println("People(String name, char sex, int age) is called.");
	}

	public String getDetails() {
		return "Name:" + name + "\nsex:" + sex + "\nage: " + age;
	}

	public String getName() {
		return name;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void printInfo() {
		System.out.println("name:" + name + " sex:" + sex + " age:" + age);
	}
}
