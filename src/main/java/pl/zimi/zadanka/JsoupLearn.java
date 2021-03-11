package pl.zimi.zadanka;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class JsoupLearn {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log(headline.attr("title") + "\n\t" + headline.absUrl("href"));
        }
    }

    private static void log(String s) {
        System.out.println(s);
    }
}
