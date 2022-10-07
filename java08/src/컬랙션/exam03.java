package 컬랙션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class exam03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		System.out.println(set);
		
		LinkedList link = new LinkedList();
		link.add("상한 우유");
		link.add("싱싱한 우유");
		link.remove();
		System.out.println(link);
		
		ArrayList list = new ArrayList();
		list.add("이스키");
		list.add("박스키");
		list.add("송스키");
		list.add("연스키");
		list.add("개스키");
		list.remove(1);
		System.out.println(list.get(1));
		
		HashMap map = new HashMap();
		map.put(1, "엄마");
		map.put(2, "아빠");
		map.put(3, "친구");
		map.put(4, "동생");
		System.out.println(map.get(2));
		
		
		
		
		
		
		
	}
}
