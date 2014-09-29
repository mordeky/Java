package ch04;

public class Teacher extends People {
	String teacherID;
	String department;

	public String getDepartment() {
		return department;
	}

	public String getTeacherID() {
		return teacherID;
	}
	
	public static void main(String args[]) {
		Teacher t = new Teacher();
		t.getDepartment();
		//System.out.println(t.age);
		System.out.println(t.name);
	}
}
