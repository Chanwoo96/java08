package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2_1 {

	public String naver(String code) {
	Element tag=null,tag2=null,tag1=null;	// TODO Auto-generated method stub
try {
			
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+code).get();
			Elements news = doc.select("td.first").select(".blind");
			Elements news1 = doc.select("div.today").select(".blind");
//			System.out.println("----------------");
		//	System.out.println("회사명 : 삼성전자");
			
//			for (int i = 0; i < news1.size(); i++) {
//				Element menu = news1.get(i);
//				System.out.println(i + ":" + menu.text());
//			}
			//전일가
			tag = news.get(0);
			String yesterday = tag.text();
//			System.out.println("전일가 : "+yesterday);
			//시가
			tag2= news.get(1);
			String start= tag2.text();
//			System.out.println("시가 : "+start);
			//현재가
			tag1 = news1.get(0);
//			String today= tag1.text();
//			System.out.println("현재가 : "+today);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
return "전일가 : "+tag.text()+"\n"+"시가 : "+tag2.text()+"\n"+"현재가 : "+tag1.text();
	}

}
