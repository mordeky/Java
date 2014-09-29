package ch04.pkg02;

import ch04.pkg01.*;

public class C11 extends C1 {
	public int PublicMethod() {
		C1 c1 = new C1();
		C11 c11 = new C11();
		
		int i1 = c1.PublicMethod();
		int i2 = c11.ProMethod();
		
		return i1 > i2 ? i1 : i2;
	}
}

class C3 {
	public int PublicMethod() {
		C1 c1 = new C1();
		C2 c2 = new C2();
		
		int i1 = c1.ProMethod();
		int i2 = c2.ProMethod();
		
		return i1 > i2 ? i1 : i2;
	}
}