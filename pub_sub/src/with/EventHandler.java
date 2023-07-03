package with;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    List<Subscriber> subscribers = new ArrayList<>();

    public void removeSubscribers(final Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void addSubscribers(final Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void handler() {
        for(final var subscriber: subscribers)
            subscriber.handle();
    }
}
