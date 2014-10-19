package ch05.sec02.string;

//����5-6 TestStringBuffer.java

public class TestStringBuffer {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("85890538");
		
		str.insert(0, "0571-");
		
		str.setCharAt(7, '2'); // ��λ����7���ַ�'8'�滻��'2'
		str.setCharAt(str.length() - 1, '5');
		
		System.out.println(str);// ���"0571-85290535"
		
		str.append("-446");
		System.out.println(str); // ���"0571-85290535-446"
		
		str.reverse();
		System.out.println(str); // ���"644-53509258-1750"
	}
}
