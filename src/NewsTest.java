public class NewsTest {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewChannel observer = new NewChannel();
        observable.addObserver(observer);

        observable.setNews("Kerala become Kashmir.....!!!!");
    }
}
