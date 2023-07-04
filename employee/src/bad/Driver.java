package bad;

public class Driver {
    public static void main(String[] args) throws Exception {
        var manager = new Manager();
        manager.setFirstName("Monkey");
        manager.setLastName("Luffy");
        manager.calculatePerHourRate(4);

        Employee employee = new CEO();
        employee.setFirstName("Roronoa");
        employee.setLastName("Zoro");
        employee.calculatePerHourRate(3);
        employee.assignManager(manager);

        System.out.printf("%s's salary is %.2f/hour", employee.getFirstName(), employee.getSalary());
    }
}
