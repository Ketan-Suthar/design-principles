package good;

public class Employee extends BaseEmployee implements IEmployee, IManaged {
    private IEmployee manager;

    @Override
    public void calculatePerHourRate(final int rank) {
        double baseAmount = 12.50;
        setSalary(baseAmount + (rank * 2));
    }

    public IEmployee getManager() {
        return manager;
    }

    public void assignManager(final IEmployee manager) throws Exception {
        // other stuff
        this.manager = manager;
    }
}
