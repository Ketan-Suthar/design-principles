package good;

public class Work implements IWork {
    private double hoursWorked = 0.0;
    private IPerson worker;
    private String work;

    private IMessageSender messageSender;

    private ILogger logger;

    @Override
    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void setWorker(final IPerson worker) {
        this.worker = worker;
    }

    public Work() {
        logger = Factory.getLogger();
        messageSender = Factory.messageSender();
    }

    @Override
    public void doWork(final double hours) {
        logger.log(hours + " hours '" + work + "' done by " + worker.getFullName());
        this.hoursWorked += hours;
    }

    @Override
    public void completeWork() {
        logger.log(worker.getFullName() + " completed '" + work + "' in "
                + hoursWorked + " hours");

        messageSender.send(worker.getFullName(), " '" + work + "' is completed");
    }
}
