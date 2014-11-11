package ch07.sec01;

public class ExceptionTrying {

	static int quotient(int x, int y) throws Exception {
		if (y == 0)
			throw new Exception("错误：除数不能是0!");
		return x / y;
	}

	static int buyAppleNum(int z) throws Exception {
		if (z < 0)
			throw new Exception("错误：购买的苹果树不能是负数!");
		return z * 2;
	}

	public static void main(String[] args) {
//		int x = 5, y = 3;
//		int x = -5, y = 3;
		int x = 5, y = 0;

		try {
			int z = quotient(x, y);
			int n = buyAppleNum(z);
			System.out.println("需要购买（"+n+"）个苹果。");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
