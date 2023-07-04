package without;

public class EventHandler {
    private final AnalyticsSubscriber analyticsSubscriber = new AnalyticsSubscriber();
    private final LogSubscriber logSubscriber = new LogSubscriber();

    public void handler() {
        analyticsSubscriber.analyze();
        logSubscriber.log();
    }
}
