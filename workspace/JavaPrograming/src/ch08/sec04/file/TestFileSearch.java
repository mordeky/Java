package ch08.sec04.file;

import java.io.File;

//�ڢڲ���ʹ��File���list()��listFiles()���й���
public class TestFileSearch {
	public static void main(String args[]) {
		// Ҫ��������������һ��������ʾĿ¼���ڶ�������ʾҪ���˵��ļ�
		//String strDir = ".", strExtension = "*.jpg";
		String strDir = "E:/Web/www/bat", strExtension = "*.bat";
		File f = new File(strDir);
		ListFilter ls = new ListFilter(strExtension);
		String str[] = f.list(ls);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}
