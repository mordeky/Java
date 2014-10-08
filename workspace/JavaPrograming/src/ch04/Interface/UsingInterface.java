package ch04.Interface;

class UsingInterface01 implements PureConstantInterface {
	
	public static void main(String args[]) {
		finalStr += SPACE + "OK!";
		
		System.out.println(finalStr);
	}
}

class UsingInterface02 implements PureAbstractFunctionInterface {
	
	public void takeoff(){}

	public void land(){}

	public void fly(){}
}

class UsingInterface03 implements PureConstantInterface, PureAbstractFunctionInterface {
	public void takeoff(){}

	public void land(){}

	public void fly(){}
	
	void test(String args[]) {
		System.out.println(finalStr + SPACE + "OK!");
	}
	
}
public class UsingInterface implements MixedInterface {
	
	public void takeoff(){}

	public void land(){}

	public void fly(){}
	
	public static void main(String args[]) {
		System.out.println(finalStr + SPACE + "OK!");
	}
}
