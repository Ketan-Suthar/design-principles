package good;

public interface IManaged extends IEmployee {
    void assignManager(IEmployee manager) throws Exception;

    IEmployee getManager();
}
