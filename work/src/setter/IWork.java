package setter;

public interface IWork {
    void setWork(String work);

    void setWorker(IPerson worker);

    void doWork(double hours);

    void completeWork();

    void setMessageSender(IMessageSender messageSender);

    void setLogger(ILogger logger);
}
