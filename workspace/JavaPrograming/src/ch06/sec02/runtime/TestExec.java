package ch06.sec02.runtime;

public class TestExec {

	public static void main(String[] args) {
		Process p = null;
		try {
			// ���Runtime��ʵ��������exec����
			Runtime r = Runtime.getRuntime();
			p = r.exec("notepad.exe c:\\count.txt");
			Thread.sleep(8000); // ����8��
			p.destroy(); // �رմ򿪵ļ��±�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
