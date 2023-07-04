package bad;

public class CEO extends Employee {
    @Override
    public void calculatePerHourRate(final int rank) {
        double baseAmount = 30.00;
        setSalary(baseAmount * rank);
    }

    @Override
    public void assignManager(Employee manager) throws Exception {
        throw new Exception("CEO has no manager");
    }

    public void generatePerformanceReview() {
        System.out.println("Generating performance review...");
    }
}
