package ch06.sec03.list;

/*��ʾ������Set�ҳ���ͬ���ַ���*/
import java.util.*;

public class FindDuplicates {
	public static void main(String args[]) {
		String args2[] = {"1", "2", "3", "4", "5", "1", "2", "3", "10"};
		// ����һ��HashSet����ȱʡ�ĳ�ʼ������16
		Set s = new HashSet();
		for (int i = 0; i < args2.length; i++) {
			/* ���������е�ÿ���ַ������뵽����s�У������ظ����ַ��������ܼ��룬������ӡ����� */
			if (!s.add(args2[i]))
				System.out.println("��⵽�ظ���: " + args2[i]);
		}
		// �������s��Ԫ�ظ����Լ������е�����Ԫ�ء�
		System.out.println(s.size() + " distinct words detected: " + s);
	}
}
