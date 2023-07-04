package good;

public class CEO extends BaseEmployee implements IManager {
    @Override
    public void calculatePerHourRate(final int rank) {
        double baseAmount = 30.00;
        setSalary(baseAmount * rank);
    }

    public void generatePerformanceReview() {
        System.out.println("Generating performance review...");
    }
}
