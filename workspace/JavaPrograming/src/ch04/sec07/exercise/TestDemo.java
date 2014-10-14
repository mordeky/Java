package ch04.sec07.exercise;

class Demo {
	int m = 5;
	public void some(int x){
		m = x;
	}
}

public class TestDemo extends Demo {
	int m = 8;
	
	public void some(int x){
		super.some(x);
		System.out.println(m);
	}
	
	public static void main(String args[]) {
		new TestDemo().some(7);
		
		Demo a = new TestDemo();
		a.some(7);
	}
}
