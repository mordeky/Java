package ch08.sec03.charstream;

import java.io.*;
/**
 * ��ȡG:/aillo.txt�ļ�������(һ��һ�ж�),����������д��G:/jacky.txt��
 * ֪ʶ��: java���ļ���д�ļ�---<���ַ�����ʽ>
*/

public class TestFileBufRWFromFile {
	public static void main(String[] args) {
		try {
			// ���Ƶ�Դ�ļ�
			String srcFile = "E:/Courseware/Java/Poem2.txt";
			// ���Ƶ�Ŀ���ļ����������ڣ�����Զ�����
			String desFile = "E:/Courseware/Java/Poem2_copy2.txt";
			
			// ����FileReader����������ȡ�ַ���
			FileReader fr = new FileReader(srcFile);
			// ����ָ���ļ�������
			BufferedReader br = new BufferedReader(fr);
			
			// ����FileWriter��������д���ַ���
			FileWriter fw = new FileWriter(desFile);
			// ��������ļ������
			BufferedWriter bw = new BufferedWriter(fw);
			
			String strLine;// ��������ÿ�ζ�ȡ��һ��
			while (br.ready()) {
				strLine = br.readLine();// ��ȡһ��
				bw.write(strLine); // д���ļ�
				bw.newLine();
				System.out.println(strLine);// ����Ļ�����
			}
			bw.flush(); // ˢ�¸����Ļ��壬�������������Ŀ��
			bw.close();
			br.close();
			fw.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
