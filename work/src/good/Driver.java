package good;

public class Driver {
    public static void main(String[] args) {
        IPerson worker = Factory.getPerson();
        worker.setFirstName("Sanji");
        worker.setLastName("Vinsmoke");

        IWork work = Factory.getWork();
        work.setWork("Cooking");
        work.setWorker(worker);

        work.doWork(3);
        work.doWork(2.5);
        work.doWork(1);
        work.completeWork();
    }
}
