package ch08.sec03.charstream;

import java.io.*;

/*�Ӽ�������һ�����֣�д���ļ�TestFileOut.txt�У�ע�⣺��������������������*/

public class TestFileWFromKeyboard {
	public static void main(String args[]) {
		char c[] = new char[512];
		byte b[] = new byte[512];
		int n, i;
		try {
			String desFile = "E:/Courseware/Java/TestFileOut2.txt";
			FileWriter wf = new FileWriter(desFile);

			// ����InputStreamReader��ȷ��ȡ����
			System.out.print("���������ģ�");
			// System.in���ֽ�����ͨ��InputStreamReader����ת��Ϊ�ַ���
			InputStreamReader isr = new InputStreamReader(System.in);
			n = isr.read(c, 0, 512);// һ���Զ�ȡ512���ַ���n��ʾʵ�ʶ�ȡ���ַ���
			wf.write(c);

//			// �Ӽ��̶������ֲ������ֽ�����b��
//			System.out.print("������(���Ľ���������)��");
//			n = System.in.read(b);
//			for (i = 0; i < n; i++)
//				c[i] = (char) b[i];

			wf.write(c);
			wf.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
