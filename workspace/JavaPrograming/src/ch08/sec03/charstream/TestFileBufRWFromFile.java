package ch08.sec03.charstream;

import java.io.*;
/**
 * 读取G:/aillo.txt文件的内容(一行一行读),并将其内容写入G:/jacky.txt中
 * 知识点: java读文件、写文件---<以字符流方式>
*/

public class TestFileBufRWFromFile {
	public static void main(String[] args) {
		try {
			// 复制的源文件
			String srcFile = "E:/Courseware/Java/Poem2.txt";
			// 复制的目标文件，若不存在，则会自动创建
			String desFile = "E:/Courseware/Java/Poem2_copy2.txt";
			
			// 创建FileReader对象，用来读取字符流
			FileReader fr = new FileReader(srcFile);
			// 缓冲指定文件的输入
			BufferedReader br = new BufferedReader(fr);
			
			// 创建FileWriter对象，用来写入字符流
			FileWriter fw = new FileWriter(desFile);
			// 将缓冲对文件的输出
			BufferedWriter bw = new BufferedWriter(fw);
			
			String strLine;// 用来保存每次读取的一行
			while (br.ready()) {
				strLine = br.readLine();// 读取一行
				bw.write(strLine); // 写入文件
				bw.newLine();
				System.out.println(strLine);// 在屏幕上输出
			}
			bw.flush(); // 刷新该流的缓冲，即将该流输出到目的
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
