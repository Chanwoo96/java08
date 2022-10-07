package 크롤링;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		//1. 사이트에 연결해서, html문서를 다 가지고 오자.
		
	try {
		Document doc1 =Jsoup.connect("https://news.naver.com/").get();
		Elements news= doc1.select(".Nitem_link_menu");
		for (int i = 0; i < news.size(); i++) {
			Element menu = news.get(i);
			System.out.println(i+":"+menu.text());
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}
}
	
//		Document doc =Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//		System.out.println(doc);
		//Elements는 ArrayList의 자식
//		Elements list =doc.select(".blind");
//		Elements list1 =doc.select(".first");
//		for (int i = 0; i < list.size(); i++) {
//			Element tag = list.get(i);
//			System.out.println(i+":"+tag);
//		}
//		Element tag1 = list.get(16);
//		System.out.println(tag1.text());
//		System.out.println(list);
//		System.out.println(list1.text());
//		Element tag1=list1.get(1);
//		System.out.println(tag1.text());
//		for (int i = 0; i < list.size(); i++) {
//			Element tag= list.get(i);
//			System.out.println(i+1+":"+tag.text());
//			
//		}
//		Elements hyun=doc.select(".no_today");
//		Element tag3=hyun.get(0);
//System.out.println("hyun"+tag3.text());				
