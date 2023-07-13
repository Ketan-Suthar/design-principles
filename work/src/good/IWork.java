package good;

public interface IWork {
    void setWork(String work);

    void setWorker(IPerson worker);

    void doWork(double hours);

    void completeWork();
}
