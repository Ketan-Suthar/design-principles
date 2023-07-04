package good;

public class Manager extends BaseEmployee implements IManager, IManaged {
    private IEmployee manager;

    @Override
    public void calculatePerHourRate(final int rank) {
        double baseAmount = 19.75;
        setSalary(baseAmount + (rank * 4));
    }

    public void generatePerformanceReview() {
        System.out.println("Generating performance review...");
    }

    public IEmployee getManager() {
        return manager;
    }

    public void assignManager(final IEmployee manager) throws Exception {
        // other stuff
        this.manager = manager;
    }
}
