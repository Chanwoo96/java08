package 컬랙션;

import java.util.ArrayList;
//generic == general  <===> specific, special
public class genericprogram {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("스트링1");
		list.add("스트링2");
		list.add("스트링3");
		list.add("스트링4");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		list2.add(700);
		System.out.println(list2);
	}
}
