import java.util.Observable;
import java.util.Observer;

//public class NewChannel implements Channel {
public class NewChannel implements Observer {
    private String news;

    @Override
    public void update(Observable o, Object news) {
        System.out.println(o.getClass().getName());
        this.setNews((String) news);
    }
    private void setNews(String news) {
        this.news = news;
        System.out.println("News received : " + news);
    }
}
