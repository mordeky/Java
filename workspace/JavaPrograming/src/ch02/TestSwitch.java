package ch02;

import java.io.IOException;

//import javax.swing.JOptionPane;

/**
 * Sec. 2.5.1: why do we need break?
 * 
 * @author Mordecai
 * @version 1.0
 * 
 */

/*
 * ctrl+shift+o 导入所有没导入的包 shift+ctrl+m 导入鼠标当前所在的地方的未导入的包
 * 1.选中你要加注释的区域，用ctrl+shift+C 会加上//注释 2.先把你要注释的东西选中，用shit+ctrl+/ 会加上 注释
 * 3.要修改在eclispe中的命令的快捷键方式我们只需进入windows -> preference -> General -> key设置就行了(转)
 */

public class TestSwitch {

	public static void main(String args[]) {
		int testScore = 88;
		char grade;
		switch (testScore / 10) { // 两个整型数相除的结果还是整型
		case 10: // 此处没有使用break
		case 9:
			grade = 'A';
			break; // 值为10和9时的操作是相同的
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'E';
			break;
		}
		System.out.println("grade is:" + grade);
	}
}

