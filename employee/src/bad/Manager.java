package bad;

public class Manager extends Employee {

    @Override
    public void calculatePerHourRate(final int rank) {
        double baseAmount = 19.75;
        setSalary(baseAmount + (rank * 4));
    }

    public void generatePerformanceReview() {
        System.out.println("Generating performance review...");
    }
}
