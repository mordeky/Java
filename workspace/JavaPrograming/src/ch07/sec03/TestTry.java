package ch07.sec03;

public class TestTry {
	public static void main(String[] args) {
		try {
			int b = 12;
			int c;

			c = b / 1;
			System.out.println("c=" + c);

			c = b / 0; // 发生异常，则该行以后的语句将全部被跳过，去执行catch或finally语句块
			System.out.println("c=" + c);
		} catch (ArithmeticException ae) {
			//catch 到一个异常匹配，则不再找其他异常了
			System.out.println("捕获了一个零除异常");
			System.exit(0);
		} catch (Exception ex) {
			// 父类异常的优先级会比子类的高，因此，捕获父类异常的代码必须放在捕获子类异常的代码后面
			System.out.println("捕获了一个未知类型的异常");
		} finally {
			/**
			 *  1. finally语句块无论是否发生异常都要执行，
			 *     除非在前面的try或catch语句块中遇到
			 *     “System.exit();” (表示强制退出程序)语句外
			 *  2. finally语句块一般包括：文件关闭、关闭数据库连接、关闭网络连接等
			 */
			System.out.println("异常处理结束");
		}
	}
}
