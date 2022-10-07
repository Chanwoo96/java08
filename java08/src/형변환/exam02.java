package 형변환;

import java.util.ArrayList;

public class exam02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		System.out.println(list);
		int money=(int)list.get(0)+2000;
		System.out.println(money);
		double height=(double)list.get(1)+10;
		System.out.println(height);
		boolean food=(boolean)list.get(2);
		if(food==false) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
			
		}
		char gen = (char)list.get(3);
		if(gen=='남') {
			System.out.println("주민번호는 1,3이예요.");
		}else {
			System.out.println("주민번호는 2,4예요.");
		}
		//int-->integer--> object 박싱 
//		int<--integer<-- object 언박싱
		
	}

}
