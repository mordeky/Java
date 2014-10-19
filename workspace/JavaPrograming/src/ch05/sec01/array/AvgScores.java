package ch05.sec01.array;

//����5-1 AvgScores.java
/*
 ��֪3λͬѧ�ĸߵ���ѧ����������Լ�Java����������ſγ̵ĳɼ�������ÿ��ͬѧ��ƽ���������������Ļ��
 */
import java.text.DecimalFormat;

/**
 * ��֪3λͬѧ�ĸߵ���ѧ����������Լ�Java����������ſγ̵ĳɼ���
 * ����ÿ��ͬѧ��ƽ���������������Ļ��
 */
class AvgScores {
	public static void main(String args[]) {
		String names[] = { "�Ź���", "����", "����" }; // ��λͬѧ������
		int[][] iScores = { { 89, 98, 87 }, { 90, 88, 95 }, { 86, 92, 93 } }; // ���ſγ̵ĳɼ�

		DecimalFormat df = new DecimalFormat("#"); // �������ʱ�ĸ�ʽ��

		int i, j;
		double avg; // ��ʱ���������ڱ���ƽ���ɼ�
		for (i = 0; i < iScores.length; i++) {
			avg = 0.0; // ��ʼ��ÿ��ͬѧ��ƽ���ɼ�
			for (j = 0; j < iScores[i].length; j++)
				avg += iScores[i][j]; // ����avg�������ſγ̵��ܺ�

			avg = avg / j; // ��ʱ��j��ʾһ���м��ſ�
			System.out.println(names[i] + ":" + df.format(avg)); // ��ʽ�����
		}
	}
}
