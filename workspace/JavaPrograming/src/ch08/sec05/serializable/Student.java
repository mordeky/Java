package ch08.sec05.serializable;

import java.io.Serializable;

/*Student定义为序列化类*/
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
		System.out.println("姓名: " + m_name);
		System.out.println("学号: " + m_id);
		System.out.println("身高: " + m_height);
	}
}
