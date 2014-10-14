package ch04.sec01.encap;

public class TestParamPass {
	String str = new String("hello");
	char ch[] = { 'd', 'b', 'c' };

	public void change1(String str, char ch[]) {
		str = "world";
		ch[0] = 'a';
	}
	
	public void change2() {
		str = "world";
		ch[0] = 'a';
	}

	public static void main(String args[]) {
		TestParamPass ex = new TestParamPass();

		ex.change1(ex.str, ex.ch);
		System.out.println(ex.str + " and " + ex.ch[0]);
		
		ex.change2();
		System.out.println(ex.str + " and " + ex.ch[0]);		
	}
}
