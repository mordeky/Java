package ch04.sec06.InnerClass;

abstract class JClass {
	int m_data;

	public JClass(int i) {
		m_data = i;
	}

	public abstract void fun();
}

public class DefineAnonymousInnerClassForAbstractClass {
	public static void main(String args[]) {
		JClass b = new JClass(5) {
			public void fun() {
				System.out.println("m_data = " + m_data);
			}
		}; // ������Ϊ�� JClass �������ڲ������
		
		b.fun();
	}
}
