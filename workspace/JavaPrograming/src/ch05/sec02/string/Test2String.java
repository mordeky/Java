package ch05.sec02.string;

// ����5-7 Test2String.java
public class Test2String {
	public static void main(String[] args) {
		/*****************************************************************************/
		{// ��������������ת�����ַ���

			boolean b = false;
			char c = 'A';
			int i = 10;
			long L = 123456789;
			// ����Ĭ�ϴ�С�����������double���ͣ�������Ҫ����Ϊfloat��
			// �����ݺ������f���������ʾ"���ܻ���ʧ����"
			float f = 1.168f;
			double d = Math.PI;

			String str;
			// ���û������Ͷ�Ӧ�Ķ������ toString() ����������ת��
			str = Boolean.toString(b);
			str = Character.toString(c);
			str = Integer.toString(i);
			str = Long.toString(L);
			str = Float.toString(f);
			str = Double.toString(d);

			// ����String ��� valueOf() ����������ת��
			str = String.valueOf(b);
			str = String.valueOf(c);
			str = String.valueOf(i);
			str = String.valueOf(L);
			str = String.valueOf(f);
			str = String.valueOf(d);

			Test2String obj = new Test2String();
			System.out.println(String.valueOf(obj));
		}
		/*****************************************************************************/
		
		{ // �� string ת���� boolean
			boolean b;
			b = Boolean.parseBoolean("True");// bΪtrue
			b = Boolean.parseBoolean("Yes");// bΪfalse
		}

		{ // �� string ת���� byte
			byte b;
			b = Byte.parseByte("-100"); // bΪ-100

			// ����ʱ��ʾ"Value out of range"����1000����byte��С
			b = Byte.parseByte("1000");

			// ��Ϊ 10A ���Ϸ����׳� NumberFormatException
			b = Byte.parseByte("10A");
		}

		return;
	}
}
