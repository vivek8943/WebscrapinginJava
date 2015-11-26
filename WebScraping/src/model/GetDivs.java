package model;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class GetDivs {

	public static void main(String[] args) throws IOException {
		 
        Document doc = Jsoup.connect("http://www.iplt20.com/archive/2008").get();
        Element content = doc.getElementById("div");
        Elements links = content.getElementsByTag("div");
        
        for (Element link : links) {
          String linkHref = link.attr("class");
          String linkText = link.text();
          System.out.println("Text::"+linkText+", URL::"+linkHref);
        }
	}}

