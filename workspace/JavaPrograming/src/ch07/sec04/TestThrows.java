package ch07.sec04;

import java.io.IOException;

public class TestThrows {
	public static void main(String[] args) {
		// method(); // ����method()����ʱ�����벶���쳣
		try {
			method();
		} catch (IOException ioe) {// ����IOException�쳣
			// ��
		}
	}

	public static void method() throws IOException {
		// ��
	}
}
