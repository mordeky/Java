package ch03;
/**
 * Sec. 3.3.4
 * @author Mordecai
 *
 */
public class TestParamPass {
	float ptValue;
	String str;

	// 参数类型是基本类型
	public void changeInt(int value) {
		value = 55;
	}

	// 参数类型是引用型，并且方法中改变参数的值
	public void changeStr(String value) {
		// value = new String("different");
		value = "different";
	}

	// 参数类型是引用型，并且方法中改变参数的值
	public void changeStr2(TestParamPass ref) {
		// value = new String("different");
		ref.str = "different";
	}

	// 参数类型是引用型，并且方法中改变了参数所指向对象的成员变量值
	public void changeObjValue(TestParamPass ref) {
		ref.ptValue = 99.0f;
	}

	public static void main(String args[]) {
		String str;
		int val;

		// 创建TestParamPass的对象
		TestParamPass pt = new TestParamPass();

		// 测试基本类型参数的传递
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is: " + val);

		// 测试引用类型参数的传递
		str = new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is: " + str);

		pt.str = "Hello";
		pt.changeStr2(pt);
		System.out.println("Str value is: " + pt.str);

		// 测试引用类型参数的传递
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is: " + pt.ptValue);
	}

}
