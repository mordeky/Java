package ch08.sec04.file;

import java.io.File;

public class TestFilePRO {

	public static void main(String[] args) {
		// 假设有文件" G:/Java1/TestFilePRO.java"和目录"G:/Java1/gfei"
		File f = new File("E:/Courseware/Java/Java/workspace/JavaPrograming/src/ch08/sec04/file/TestFilePRO.java");
		//File f = new File("TestFilePRO.java");
		File d = new File("Gfei");

		System.out.println("f.getName=" + f.getName());// 输出TestFilePRO.java
		System.out.println("f.getPath=" + f.getPath());// 输出TestFilePRO.java
		
		// 输出G:\Java1\TestFilePRO.java
		System.out.println("f.getAbsolutePath=" + f.getAbsolutePath());
		System.out.println("f.getParent=" + f.getParent());// 输出null
		System.out.println("f.length=" + f.length());// 笔者示例中输出668

		System.out.println("d.getName=" + d.getName());// 输出Gfei
		System.out.println("d.getPath=" + d.getPath());// 输出Gfei
		System.out.println("d.getAbsolutePath=" + d.getAbsolutePath());// 输出G:\java1\Gfei
		System.out.println("d.getParent=" + d.getParent());// 输出null
		System.out.println("d.length=" + d.length());// 输出0
	}

}
