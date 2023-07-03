package with;

public class Driver {
    public static void main(String[] args) {
        EventHandler eventHandler = new EventHandler();
        var analyticsSubscriber = new AnalyticsSubscriber();
        eventHandler.addSubscribers(analyticsSubscriber);
        eventHandler.handler();

        eventHandler.addSubscribers(new LogSubscriber());
        eventHandler.handler();

        eventHandler.removeSubscribers(analyticsSubscriber);
        eventHandler.handler();
    }
}
