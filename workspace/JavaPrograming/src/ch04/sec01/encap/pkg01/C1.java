package ch04.sec01.encap.pkg01;

public class C1 {
	public int PublicMethod() {
		return 1;
	};

	protected int ProMethod() {
		return 2;
	}

	// д╛хох╗оч
	int DefMethod() {
		C2 c2 = new C2();
		return c2.ProMethod();
	}
}

class C2 {
	public int PublicMethod() {
		return 1;
	};

	protected int ProMethod() {
		return 2;
	}
}
