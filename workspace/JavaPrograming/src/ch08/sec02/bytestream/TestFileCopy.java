package ch08.sec02.bytestream;

/*以下示例用于说明如何利用FileOutputStream进行文件复制*/
import java.io.*;

public class TestFileCopy {
	public static void main(String args[]) {
		try {
			// 复制的源文件TestVector.java
			String srcFile = "E:/Courseware/Java/Poem2.txt";
			// 复制的目的文件TV2.txt，若不存在，则会自动创建
			String desFile = "E:/Courseware/Java/Poem2_12334.txt";
			
			FileInputStream rf = new FileInputStream(srcFile);
			FileOutputStream wf = new FileOutputStream(desFile);
			
			byte b[] = new byte[512];
			int count = -1;
			// 每次读取512个字节，count用于记录实际读取的字节数
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
