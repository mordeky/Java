package ch08.sec04.file;

import java.io.*;

//�ڢٲ�������������ListFilter��ʵ��FilenameFilter�ӿ��е�accept����
class ListFilter implements FilenameFilter {
	private String pre = "", ext = "";// pre��ʾ�ļ�ǰ׺��ext��ʾ�ļ���׺

	public ListFilter(String filterstr) {
		int i, j;
		filterstr = filterstr.toLowerCase();
		i = filterstr.indexOf("*");
		j = filterstr.indexOf(".");
		if (i > 0)
			pre = filterstr.substring(0, i);
		if (i == -1 & j > 0)
			pre = filterstr.substring(0, j);
		if (j >= 0)
			ext = filterstr.substring(j + 1);
	}

	// ʵ��accept����
	public boolean accept(File dir, String filename) {
		boolean y = true;
		try {
			filename = filename.toLowerCase();
			y = filename.startsWith(pre) & filename.endsWith(ext);
		} catch (NullPointerException e) {
		}
		return y;
	}
}
