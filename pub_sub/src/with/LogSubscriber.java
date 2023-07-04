package with;

public class LogSubscriber implements Subscriber {
    @Override
    public void handle() {
        System.out.println("inside log from good");
    }
}
