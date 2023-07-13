package good;

public class Logger implements ILogger {
    public void log(final String message) {
        System.out.printf("logging message: %s\n", message);
    }
}
