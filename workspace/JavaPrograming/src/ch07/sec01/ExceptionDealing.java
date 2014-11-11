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
			System.out.println("错误：除数不能是0!");
			return;
		}
		
		int z = quotient(x, y);
		
		if(z < 0){
			System.out.println("错误：购买的苹果树不能是负数!");
			return;
		}
		
		int n = buyAppleNum(z);
		System.out.println("需要购买（"+n+"）个苹果。");
	}

}
