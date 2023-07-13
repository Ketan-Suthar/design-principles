package good;

public class Factory {
    public static IPerson getPerson() {
        return new Person();
    }

    public static IWork getWork() {
        return new Work();
    }

    public static ILogger getLogger() {
        return new Logger();
    }

    public static IMessageSender messageSender() {
        return new EMailer();
    }
}
