package ch08.sec04.file;

import java.io.File;

//第②步：使用File类的list()和listFiles()进行过滤
public class TestFileSearch {
	public static void main(String args[]) {
		// 要求两个参数：第一个参数表示目录，第二参数表示要过滤的文件
		//String strDir = ".", strExtension = "*.jpg";
		String strDir = "E:/Web/www/bat", strExtension = "*.bat";
		File f = new File(strDir);
		ListFilter ls = new ListFilter(strExtension);
		String str[] = f.list(ls);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}
