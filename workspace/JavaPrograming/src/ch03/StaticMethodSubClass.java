package ch03;
//package test;

class StaticMethodSupClass{
	public void methodOne(int i){}
	public void methodTwo(int i){}
	public static void methodThree(int i){}
	public static void methodForth(int i){}
}

class StaticMethodSubClass extends StaticMethodSupClass{
	public static void methodOne(int i){} 
	public void methodTwo(int i){}
	public void methodThree(int i){}
	public static void methodForth(int i){}
}

