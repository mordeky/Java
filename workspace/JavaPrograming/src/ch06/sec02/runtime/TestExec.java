package ch06.sec02.runtime;

public class TestExec {

	public static void main(String[] args) {
		Process p = null;
		try {
			// 获得Runtime的实例并调用exec方法
			Runtime r = Runtime.getRuntime();
			p = r.exec("notepad.exe c:\\count.txt");
			Thread.sleep(8000); // 休眠8秒
			p.destroy(); // 关闭打开的记事本
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
