package ch07.sec01;

public class ExceptionDealing {

	static int quotient(int x, int y) {
		return x / y;
	}
	
	static int buyAppleNum(int z) {
		return z*2;
	}
	
	public static void main(String[] args) {
//		int x = 5, y = 3;
//		int x = -5, y = 3;
		int x = 5, y = 0;
		
		if(y == 0){
			System.out.println("���󣺳���������0!");
			return;
		}
		
		int z = quotient(x, y);
		
		if(z < 0){
			System.out.println("���󣺹����ƻ���������Ǹ���!");
			return;
		}
		
		int n = buyAppleNum(z);
		System.out.println("��Ҫ����"+n+"����ƻ����");
	}

}
