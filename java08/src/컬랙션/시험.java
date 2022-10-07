package 컬랙션;

import java.util.LinkedList;

public class 시험 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("국어");
		link.add("수학");
		link.add("영어");
		link.add("컴퓨터");
		System.out.println(link);
		for (int i = 0; i < 4; i++) {
			link.remove();
			System.out.println(i+1+"일차 남은 과목"+link);
			
		}
	
	}

}
