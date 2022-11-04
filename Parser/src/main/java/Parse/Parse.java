package Parse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Parse {
    private int curTitle;
    public void Parsing() throws IOException {
        Document doc = Jsoup.connect("https://animego.org/anime")
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();
        for (int i = 1; i < 21; i++) {
            curTitle = i;
            Elements listNews = doc.select("#anime-list-container > div:nth-child( " + curTitle +") > div ");
            System.out.println(i + " " + listNews.text());
        }
    }
}

