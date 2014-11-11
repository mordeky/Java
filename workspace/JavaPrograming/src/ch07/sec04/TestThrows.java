package ch07.sec04;

import java.io.IOException;

public class TestThrows {
	public static void main(String[] args) {
		// method(); // 调用method()方法时，必须捕获异常
		try {
			method();
		} catch (IOException ioe) {// 捕获IOException异常
			// …
		}
	}

	public static void method() throws IOException {
		// …
	}
}
