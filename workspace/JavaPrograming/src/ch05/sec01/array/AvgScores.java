package ch05.sec01.array;

//程序5-1 AvgScores.java
/*
 已知3位同学的高等数学、汇编语言以及Java程序设计三门课程的成绩，计算每个同学的平均分数并输出到屏幕。
 */
import java.text.DecimalFormat;

/**
 * 已知3位同学的高等数学、汇编语言以及Java程序设计三门课程的成绩，
 * 计算每个同学的平均分数并输出到屏幕。
 */
class AvgScores {
	public static void main(String args[]) {
		String names[] = { "张国荣", "丁二", "陈坤" }; // 三位同学的姓名
		int[][] iScores = { { 89, 98, 87 }, { 90, 88, 95 }, { 86, 92, 93 } }; // 三门课程的成绩

		DecimalFormat df = new DecimalFormat("#"); // 用于输出时的格式化

		int i, j;
		double avg; // 临时变量，用于保存平均成绩
		for (i = 0; i < iScores.length; i++) {
			avg = 0.0; // 初始化每个同学的平均成绩
			for (j = 0; j < iScores[i].length; j++)
				avg += iScores[i][j]; // 先用avg保存三门课程的总和

			avg = avg / j; // 此时的j表示一共有几门课
			System.out.println(names[i] + ":" + df.format(avg)); // 格式化输出
		}
	}
}
