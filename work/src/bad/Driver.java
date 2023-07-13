package bad;

public class Driver {
    public static void main(String[] args) {
        Person worker = new Person();
        worker.setFirstName("Sanji");
        worker.setLastName("Vinsmoke");

        Work work = new Work("Cooking");
        work.setWorker(worker);

        work.doWork(3);
        work.doWork(2.5);
        work.doWork(1);
        work.completeWork();
    }
}
