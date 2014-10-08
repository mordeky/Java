package ch04.InnerClass;

public class AccessOuterMember {
	private int size;

	/**
	 * ���ڲ��ࡿ���ʡ��ⲿ�ࡿ�ĳ�Ա
	 */
	public class Inner1 {
		// ���ⲿ��ĳ�Ա����size����
		public void doStuff() {
			size++;
		}
	}
	
	/**
	 * ���ڲ�����ⲿ���������ͻʱ����ʽ���ʡ��ⲿ�ࡿ�͡��ڲ��ࡿ�ĳ�Ա
	 */
	public class Inner2 {
		private int size;

		// ���ⲿ��ĳ�Ա����size����
		public void doStuff(int size) {
			size++; // ��ȡ����
			this.size++; // ��ȡ�ڲ���ĳ�Ա����
			AccessOuterMember.this.size++; // ��ȡ�������AccessOuterMember�ĳ�Ա����
			System.out.println("size in Inner1.doStuff(): " + size);
			System.out.println("size of the Inner1 class: " + this.size);
			System.out.println("size of the AccessOuterMember class: "
					+ AccessOuterMember.this.size);
		}
	}

	Inner1 c1 = new Inner1(); // ��Ա���� c1 ָ�� Inner1 ��Ķ���
	Inner2 c2 = new Inner2(); // ��Ա���� c2 ָ�� Inner2 ��Ķ���

	public void increaseSize() {
		c1.doStuff(); // �����ڲ���Inner�ķ���
	}

	public static void main(String args[]) {
		/**
		 * �ڲ����Ա�����ⲿ��ĳ�Ա
		 */
		AccessOuterMember o = new AccessOuterMember();
		
		for (int i = 0; i < 4; i++) {
			o.increaseSize();
			System.out.println("The value of size : " + o.size);
		}
		
		/**
		 * ���ڲ�����ⲿ���������ͻʱ����ʽ���ʡ��ⲿ�ࡿ�͡��ڲ��ࡿ�ĳ�Ա
		 */
		System.out.println("==============================");
		o.c2.doStuff(0);
	}
}
