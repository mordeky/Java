package ch08.sec02.bytestream;

/*����ʾ������˵���������FileOutputStream�����ļ�����*/
import java.io.*;

public class TestFileCopy {
	public static void main(String args[]) {
		try {
			// ���Ƶ�Դ�ļ�TestVector.java
			String srcFile = "E:/Courseware/Java/Poem2.txt";
			// ���Ƶ�Ŀ���ļ�TV2.txt���������ڣ�����Զ�����
			String desFile = "E:/Courseware/Java/Poem2_12334.txt";
			
			FileInputStream rf = new FileInputStream(srcFile);
			FileOutputStream wf = new FileOutputStream(desFile);
			
			byte b[] = new byte[512];
			int count = -1;
			// ÿ�ζ�ȡ512���ֽڣ�count���ڼ�¼ʵ�ʶ�ȡ���ֽ���
			while ((count = rf.read(b, 0, 512)) != -1)
				wf.write(b, 0, count);

			rf.close();
			wf.close();
		} catch (IOException ie) {
			System.out.println(ie.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
