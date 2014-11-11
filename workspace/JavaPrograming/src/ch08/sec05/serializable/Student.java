package ch08.sec05.serializable;

import java.io.Serializable;

/*Student����Ϊ���л���*/
public class Student implements Serializable {
	static final long serialVersionUID = 123456L;
	String m_name;
	int m_id;
	int m_height;

	public Student(String name, int id, int h) {
		m_name = name;
		m_id = id;
		m_height = h;
	}

	public void output() {
		System.out.println("����: " + m_name);
		System.out.println("ѧ��: " + m_id);
		System.out.println("���: " + m_height);
	}
}
