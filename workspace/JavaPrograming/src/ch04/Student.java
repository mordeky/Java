package ch04;

/**
 * Student類：用於演示繼承關係
 * @author Mordecai
 *
 */
public class Student extends People {
	int studentID;
	String major;

	public Student() {
		System.out.println("Student() is called.");
	}

	/**
	 * 1. 若不使用super关键字明确指定要调用的父类的构造方法，
	 *    则自动调用父类的无参数构造方法；
	 * 2. 如果父类中没有无参数的构造方法，则将产生错误。
	 * 3. 因此，父类一般都需要包括一个不带参数的构造方法，以防止子类省略super关键字时出现错误。
	 */
	public Student(int ID) {
		studentID = 1;
		System.out.println("Student(int ID) is called.");
	}

	public Student(String name, char sex, int age) {
		super(name, sex, age);
		studentID = 1;
		System.out.println("Student(String name, char sex, int age) is called.");
	}

	public String getMajor() {
		return major;
	}

	public int getStudentID() {
		return studentID;
	}

	/**
	 * 測試：父類和子類的構造方法調用的先後次序
	 */
	public static void testConstructor() {
		Student s = new Student();
		s.getMajor();

		System.out.println("\n------------------------");
		Student s2 = new Student(2);
		
		System.out.println("\n------------------------");
		Student s3 = new Student("Tom", 'm', 18);
	}
	
	public static void main(String args[]) {
		testConstructor();
	}
}
