package ch03;
/**
 * Sec. 3.3.4
 * @author Mordecai
 *
 */
public class TestParamPass {
	float ptValue;
	String str;

	// ���������ǻ�������
	public void changeInt(int value) {
		value = 55;
	}

	// ���������������ͣ����ҷ����иı������ֵ
	public void changeStr(String value) {
		// value = new String("different");
		value = "different";
	}

	// ���������������ͣ����ҷ����иı������ֵ
	public void changeStr2(TestParamPass ref) {
		// value = new String("different");
		ref.str = "different";
	}

	// ���������������ͣ����ҷ����иı��˲�����ָ�����ĳ�Ա����ֵ
	public void changeObjValue(TestParamPass ref) {
		ref.ptValue = 99.0f;
	}

	public static void main(String args[]) {
		String str;
		int val;

		// ����TestParamPass�Ķ���
		TestParamPass pt = new TestParamPass();

		// ���Ի������Ͳ����Ĵ���
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is: " + val);

		// �����������Ͳ����Ĵ���
		str = new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is: " + str);

		pt.str = "Hello";
		pt.changeStr2(pt);
		System.out.println("Str value is: " + pt.str);

		// �����������Ͳ����Ĵ���
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is: " + pt.ptValue);
	}

}
