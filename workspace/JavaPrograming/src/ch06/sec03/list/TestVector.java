package ch06.sec03.list;

/*��ʾVector��ʹ�á�����Vector�Ĵ�������Vector�����Ԫ�ء���Vector��ɾ��Ԫ�ء� ͳ��Vector��Ԫ�صĸ����ͱ���Vector�е�Ԫ�ء�*/
import java.util.*;

public class TestVector {
	public static void main(String[] args) {
		// ʹ��Vector�Ĺ��췽������
		Vector v = new Vector(4);
		
		// ��Vector�����Ԫ��: ʹ��add����ֱ�����Ԫ��
		v.add("Test0");
		v.add("Test1");
		v.add("Test0");
		v.add("Test2");
		v.add("Test2");
		
		// ��Vector��ɾ��Ԫ��
		v.remove("Test0"); // ɾ��ָ�����ݵ�Ԫ��
		//v.remove(0); // ����������ɾ��Ԫ��

		int size = v.size();// ���Vector������Ԫ�صĸ���
		System.out.println("size:" + size); // ���size:3

		for (int i = 0; i < size; i++) {// ����Vector�е�Ԫ��
			System.out.println(v.get(i));
		}
	}
}
