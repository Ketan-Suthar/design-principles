package bad;

public class Work {
    private double hoursWorked = 0.0;
    private Person worker;
    private String work;

    public void setWorker(final Person worker) {
        this.worker = worker;
    }

    public Work() {}

    public Work(final String work) {
        this.work = work;
    }

    public void doWork(final double hours) {
        Logger logger = new Logger();
        logger.log(hours + " hours '" + work + "' done by " + worker.getFullName());
        this.hoursWorked += hours;
    }

    public void completeWork() {
        Logger logger = new Logger();
        logger.log(worker.getFullName() + " completed '" + work + "' in "
                + hoursWorked + " hours");

        EMailer mailer = new EMailer();
        mailer.sendEmail(worker.getFullName(), " '" + work + "' is completed");
    }
}
