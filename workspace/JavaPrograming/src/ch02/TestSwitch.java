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
 * ctrl+shift+o ��������û����İ� shift+ctrl+m ������굱ǰ���ڵĵط���δ����İ�
 * 1.ѡ����Ҫ��ע�͵�������ctrl+shift+C �����//ע�� 2.�Ȱ���Ҫע�͵Ķ���ѡ�У���shit+ctrl+/ ����� ע��
 * 3.Ҫ�޸���eclispe�е�����Ŀ�ݼ���ʽ����ֻ�����windows -> preference -> General -> key���þ�����(ת)
 */

public class TestSwitch {

	public static void main(String args[]) {
		int testScore = 88;
		char grade;
		switch (testScore / 10) { // ��������������Ľ����������
		case 10: // �˴�û��ʹ��break
		case 9:
			grade = 'A';
			break; // ֵΪ10��9ʱ�Ĳ�������ͬ��
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

