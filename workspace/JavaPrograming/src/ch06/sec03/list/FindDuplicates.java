package ch06.sec03.list;

/*本示例利用Set找出不同的字符串*/
import java.util.*;

public class FindDuplicates {
	public static void main(String args[]) {
		String args2[] = {"1", "2", "3", "4", "5", "1", "2", "3", "10"};
		// 创建一个HashSet对象，缺省的初始容量是16
		Set s = new HashSet();
		for (int i = 0; i < args2.length; i++) {
			/* 将命令行中的每个字符串加入到集合s中，其中重复的字符串将不能加入，并被打印输出。 */
			if (!s.add(args2[i]))
				System.out.println("检测到重复项: " + args2[i]);
		}
		// 输出集合s的元素个数以及集合中的所有元素。
		System.out.println(s.size() + " distinct words detected: " + s);
	}
}
