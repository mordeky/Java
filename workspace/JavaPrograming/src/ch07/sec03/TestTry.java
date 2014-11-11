package ch07.sec03;

public class TestTry {
	public static void main(String[] args) {
		try {
			int b = 12;
			int c;

			c = b / 1;
			System.out.println("c=" + c);

			c = b / 0; // �����쳣��������Ժ����佫ȫ����������ȥִ��catch��finally����
			System.out.println("c=" + c);
		} catch (ArithmeticException ae) {
			//catch ��һ���쳣ƥ�䣬�����������쳣��
			System.out.println("������һ������쳣");
			System.exit(0);
		} catch (Exception ex) {
			// �����쳣�����ȼ��������ĸߣ���ˣ��������쳣�Ĵ��������ڲ��������쳣�Ĵ������
			System.out.println("������һ��δ֪���͵��쳣");
		} finally {
			/**
			 *  1. finally���������Ƿ����쳣��Ҫִ�У�
			 *     ������ǰ���try��catch����������
			 *     ��System.exit();�� (��ʾǿ���˳�����)�����
			 *  2. finally����һ��������ļ��رա��ر����ݿ����ӡ��ر��������ӵ�
			 */
			System.out.println("�쳣�������");
		}
	}
}
