package ch05.sec01.array;

//³ÌÐò5-2 PassArray (CallArray.java)
public class PassArray {
	static void updateArray(int[] arrays) {
		arrays[3] = 10;
	}

	public static void main(String[] args) {
		int[] hold = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		updateArray(hold);
		
		for (int i = 0; i < hold.length; i++)
			System.out.print(hold[i] + " ");
	}
}
