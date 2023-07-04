package with;

public class AnalyticsSubscriber implements Subscriber {
    @Override
    public void handle() {
        System.out.println("inside analyze from good");
    }
}
