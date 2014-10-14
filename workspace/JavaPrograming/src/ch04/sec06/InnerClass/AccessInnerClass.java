package ch04.sec06.InnerClass;

public class AccessInnerClass {
	/**
	 * ��̬�ڲ���
	 */
	static class StaticInner {
		double s;
		final static double PI = 3.1415;

		double Area(double r) {
			return s = PI * r * r;
		}

		void printArea() {
			System.out.println("StaticInner.area = " + s);
		}
	}

	/**
	 * �Ǿ�̬�ڲ���
	 */
	class DefaultInner {
		double s;
		final static String FORMAT = "[0-9][0-5]";

		double Area(double w, double h) {
			return s = w * h;
		}

		void printArea() {
			System.out.println("DefaultInner.area = " + s);
		}
	}

	public static void main(String args[]) {
		/**
		 * ��������̬ʵ���ڲ��ࡿ�����������ڲ���Ա
		 */
		// ��������̬ʵ���ڲ��ࡿ
		AccessInnerClass.StaticInner c1 = new AccessInnerClass.StaticInner();

		// ���ʡ���̬ʵ���ڲ��ࡿ�ġ���̬��Ա��
		System.out.println(AccessInnerClass.StaticInner.PI);

		// ���ʾ�̬ʵ���ڲ���ķǾ�̬��Ա��
		c1.Area(10.0);
		c1.printArea();

		/**
		 * �������Ǿ�̬ʵ���ڲ��ࡿ�����������ڲ���Ա
		 */
		// �������Ǿ�̬ʵ���ڲ��ࡿ
		AccessInnerClass o = new AccessInnerClass();
		AccessInnerClass.DefaultInner c21 = o.new DefaultInner();
		AccessInnerClass.DefaultInner c22 = new AccessInnerClass().new DefaultInner();

		// ���ʡ��Ǿ�̬ʵ���ڲ��ࡿ�ġ���̬��Ա��
		System.out.println(AccessInnerClass.DefaultInner.FORMAT);

		// ���ʡ��Ǿ�̬ʵ���ڲ��ࡿ�ġ��Ǿ�̬������
		c22.Area(10.0, 20.0);
		c22.printArea();
	}
}
