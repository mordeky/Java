package ch04.Interface;

public interface PureConstantInterface {
	/**
	 * 接口中声明的变量全部为 final 和 static 类型的
	 */
	public static final String SPACE = " ";
	public static final char FORMAT = '\t';
	
	// 不管是否声明为 static final, 
	// finalStr 都是 static final
	String finalStr = "Hello World!"; 
}
