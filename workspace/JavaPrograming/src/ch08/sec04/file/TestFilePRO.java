package ch08.sec04.file;

import java.io.File;

public class TestFilePRO {

	public static void main(String[] args) {
		// �������ļ�" G:/Java1/TestFilePRO.java"��Ŀ¼"G:/Java1/gfei"
		File f = new File("E:/Courseware/Java/Java/workspace/JavaPrograming/src/ch08/sec04/file/TestFilePRO.java");
		//File f = new File("TestFilePRO.java");
		File d = new File("Gfei");

		System.out.println("f.getName=" + f.getName());// ���TestFilePRO.java
		System.out.println("f.getPath=" + f.getPath());// ���TestFilePRO.java
		
		// ���G:\Java1\TestFilePRO.java
		System.out.println("f.getAbsolutePath=" + f.getAbsolutePath());
		System.out.println("f.getParent=" + f.getParent());// ���null
		System.out.println("f.length=" + f.length());// ����ʾ�������668

		System.out.println("d.getName=" + d.getName());// ���Gfei
		System.out.println("d.getPath=" + d.getPath());// ���Gfei
		System.out.println("d.getAbsolutePath=" + d.getAbsolutePath());// ���G:\java1\Gfei
		System.out.println("d.getParent=" + d.getParent());// ���null
		System.out.println("d.length=" + d.length());// ���0
	}

}
