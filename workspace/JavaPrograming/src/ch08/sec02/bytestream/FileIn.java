package ch08.sec02.bytestream;

/*��mytext.txt�ļ���������ʾ����Ļ��*/
import java.io.*;

public class FileIn {
	public static void main(String args[]) {
		try {
//			String strFile = "E:/Courseware/Java/workspace/Poem1.txt";
			String strFile = "E:/Courseware/Java/workspace/Poem2.txt";
			//���ļ�
			FileInputStream rf = new FileInputStream(strFile);
			int b;
			while ((b = rf.read()) != -1)
				// ��read()��������ֽڶ�ȡ
				System.out.print((char) b); // ת����char����ʾ
			rf.close();
		} catch (IOException ie) {
			System.out.println(ie);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
