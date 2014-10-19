package ch05.sec01.array;

public class TestArrayDef {

	public static void main(String args[]) {
		int[] d1;
		int d2[];
		char[] c;
		char c2[];
		String[] name1;
		String name2[];

		d1 = new int[10];
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i]);
		}

		/**
		 * 二维数组
		 */
		// 二维【基本数组】的初始化
		int iArray[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 直接初始化
		char cArray[][] = { { 'A', 'B' }, { 'C' }, { 'D', 'E', 'F' },
				{ 'G', 'H' } };
		String sArray[][] = { { "Hello", "World" }, { "How", "Are", "You" } };

		int len = cArray.length; // 返回最高维的长度(二维数组的行数)
		System.out.println("cArray.length = " + len);
		System.out.println("sArray.length = " + sArray.length);
		System.out.println("sArray[1].length = " + sArray[1].length);

		char[] cArray1 = { 'B', 'C', 'D', 'E' };
		char[] cArray2 = { 'A', 'B', 'C', 'D', 'E' };
		String s1 = new String(cArray1);
	}
}
