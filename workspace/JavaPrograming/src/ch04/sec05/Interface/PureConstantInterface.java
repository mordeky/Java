package ch04.sec05.Interface;

public interface PureConstantInterface {
	/**
	 * 接口中声明的变量全部�?final �?static 类型�?
	 */
	public static final String SPACE = " ";
	public static final char FORMAT = '\t';
	
	// 不管是否声明�?static final, 
	// finalStr 都是 static final
	String finalStr = "Hello World!"; 
}
