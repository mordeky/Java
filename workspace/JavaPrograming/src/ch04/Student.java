package ch04;

/**
 * Student������ʾ�^���P�S
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
	 * 1. ����ʹ��super�ؼ�����ȷָ��Ҫ���õĸ���Ĺ��췽����
	 *    ���Զ����ø�����޲������췽����
	 * 2. ���������û���޲����Ĺ��췽�����򽫲�������
	 * 3. ��ˣ�����һ�㶼��Ҫ����һ�����������Ĺ��췽�����Է�ֹ����ʡ��super�ؼ���ʱ���ִ���
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
	 * �yԇ�������Ę��췽���{�õ��������
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
