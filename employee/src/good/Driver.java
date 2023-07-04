package good;

public class Driver {
    public static void main(String[] args) throws Exception {
        IEmployee manager = new Manager();
        manager.setFirstName("Monkey");
        manager.setLastName("Luffy");
        manager.calculatePerHourRate(4);

        IEmployee employee = new CEO();
        employee.setFirstName("Roronoa");
        employee.setLastName("Zoro");
        employee.calculatePerHourRate(3);
//        employee.assignManager(manager);

        System.out.printf("%s's salary is %.2f/hour", employee.getFirstName(), employee.getSalary());
//        System.out.printf("\nmanager is: %s", employee.getManager().getFullName());
    }
}
