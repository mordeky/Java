package ch08.sec04.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestFileRAF {
	public static void main(String args[]) {
		try {
			RandomAccessFile f = new RandomAccessFile("TestFileRAF.txt", "rw");//�ɶ�д
			int i;
			double d;
			// д�����ļ�д��10������
			for (i = 0; i < 10; i++)
				f.writeDouble(Math.PI * i);
//			//f.seek(0);
//			// �޸ģ����ļ��е�2��double���ݸ�Ϊ0
//			f.seek(16);// �ļ�ָ����ǰ��16���ֽ�(2��double����)
//			f.writeDouble(0);
//
//			f.seek(0);// �ļ�ָ��ص��ļ��ײ�

			// ��ȡ����ȫ�����ݶ�������ӡ����Ļ��
			for (i = 0; i < 10; i++) {
				d = f.readDouble();
				System.out.println("[" + i + "]: " + d);
			}
			f.close();
		} catch (IOException e) {
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		}
	}
}
