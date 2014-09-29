package ch05;

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
	}
}
