package ch08.sec02.bytestream;

/*从mytext.txt文件读出并显示在屏幕上*/
import java.io.*;

public class FileIn {
	public static void main(String args[]) {
		try {
//			String strFile = "E:/Courseware/Java/workspace/Poem1.txt";
			String strFile = "E:/Courseware/Java/workspace/Poem2.txt";
			//打开文件
			FileInputStream rf = new FileInputStream(strFile);
			int b;
			while ((b = rf.read()) != -1)
				// 用read()方法逐个字节读取
				System.out.print((char) b); // 转换成char并显示
			rf.close();
		} catch (IOException ie) {
			System.out.println(ie);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
