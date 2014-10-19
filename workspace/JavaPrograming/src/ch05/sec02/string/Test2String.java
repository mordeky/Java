package ch05.sec02.string;

// 程序5-7 Test2String.java
public class Test2String {
	public static void main(String[] args) {
		/*****************************************************************************/
		{// 将其他数据类型转换成字符串

			boolean b = false;
			char c = 'A';
			int i = 10;
			long L = 123456789;
			// 由于默认带小数点的数据是double类型，因此如果要定义为float，
			// 在数据后面加上f，否则会提示"可能会损失精度"
			float f = 1.168f;
			double d = Math.PI;

			String str;
			// 利用基本类型对应的对象类的 toString() 方法，进行转换
			str = Boolean.toString(b);
			str = Character.toString(c);
			str = Integer.toString(i);
			str = Long.toString(L);
			str = Float.toString(f);
			str = Double.toString(d);

			// 利用String 类的 valueOf() 方法，进行转换
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
		
		{ // 将 string 转换成 boolean
			boolean b;
			b = Boolean.parseBoolean("True");// b为true
			b = Boolean.parseBoolean("Yes");// b为false
		}

		{ // 将 string 转换成 byte
			byte b;
			b = Byte.parseByte("-100"); // b为-100

			// 运行时显示"Value out of range"，因1000超出byte大小
			b = Byte.parseByte("1000");

			// 因为 10A 不合法，抛出 NumberFormatException
			b = Byte.parseByte("10A");
		}

		return;
	}
}
