package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("홍길동");//object<-- String 큰 <- 작 자동형변환, up casting)
	list.add(100);
	list.add(0.42);
	list.add(true);
	list.add(new JButton());
	System.out.println(list.size());
	String name= (String)list.get(0);
	//String(작)<-- Object(큰) 강제형변환 필요
	String name1= (String)list.get(0);
	//String(작)<-- Object(큰) 강제형변환, down casting
	//int<--> Integer<-- Object
	//기본형과관련된 처리를 하기위해서 부품을 크게 만들어놨음
	//기본형+포장=> 포장클래스(wrapper클래스)
	//기본형과 포장클래스간에는 자동변환이 가능
	//int-->Integer : boxing, 박싱
	//int<---Integer : unboxing, 언박싱
	//autoboxing, autounboxing
	int age = (int)list.get(1);
	double dou=(double)list.get(2);
	
}
}
