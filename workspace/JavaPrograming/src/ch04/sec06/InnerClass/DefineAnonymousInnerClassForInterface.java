package ch04.sec06.InnerClass;

interface JInterface {
	int m_data = 5;
	public abstract void fun();
}

public class DefineAnonymousInnerClassForInterface {
	public static void main(String args[]) {
		JInterface b = new JInterface() {
			public void fun() {
				System.out.println("m_data = " + m_data);
			}
		}; // ������Ϊ�� JInterface �������ڲ������
		
		b.fun();
	}
}
