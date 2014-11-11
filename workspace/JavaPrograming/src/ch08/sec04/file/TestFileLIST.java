package ch08.sec04.file;

import java.io.*;
/**
 * ��ӡĳĿ¼��(������Ŀ¼)�����ļ����ļ���С
 * @author Mdk
 *
 */
public class TestFileLIST {
	public static void main(String args[]) throws IOException {
		File files = new File("."); // "."��ʾ��ǰĿ¼(��TestFileLIST.java���ڵ�ͬһ��Ŀ¼)
		listPath(files);
	}

	public static void listPath(File f) throws IOException {
		String file_list[] = f.list();
		for (int i = 0; i < file_list.length; i++) {
			File cf = new File(f.getPath(), file_list[i]);
			if (cf.isDirectory()) {// �ж��Ƿ�Ϊ��Ŀ¼
				listPath(cf);// �оٸ���Ŀ¼�µ��ļ�
			}
			if (cf.isFile()) {// �ж��Ƿ�Ϊ�ļ�
				try {
					// ����ļ���С
					System.out.println(cf.getCanonicalPath() + ":"
							+ cf.length());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
