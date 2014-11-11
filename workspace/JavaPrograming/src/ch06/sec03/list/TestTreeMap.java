package ch06.sec03.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		// Map map = new LinkedHashMap();
		map.put("c", "ccc");
		map.put("d", "ddd");
		map.put("a", "aaa");
		map.put("b", "bbb");

		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			Object key = iter.next();
			System.out.println("map key " + key.toString() + " value="
					+ map.get(key));
		}

		TreeMap tab = new TreeMap();
		tab.put("f", "fff");
		tab.put("a", "aaa");
		tab.put("c", "ccc");
		tab.put("d", "ddd");
		tab.put("b", "bbb");

		Iterator iter2 = tab.keySet().iterator();
		while (iter2.hasNext()) {
			Object key = iter2.next();
			System.out.println("tab key " + key.toString() + " value="
					+ tab.get(key));
		}

		String[] strings = { "A", "B", "C", "D" };
		Collection stringList = java.util.Arrays.asList(strings);
		for (Object str : stringList) {// 开始遍历
			System.out.println(str);// 依次输出
		}
	}
}
