package without;

import java.util.ArrayList;
import java.util.List;

public class WithoutDriver {
    public static void main(String[] args) {
        final var personList = new ArrayList<Person>();
        personList.add(new Person("Monkey", "Luffy"));
        personList.add(new Person("Edward", "NewGate", EmployeeType.Manager));
        personList.add(new Person("Akagami", "Shanks", EmployeeType.Executive));

        final var accountProcessor = new Accounts();
        final var employeeList = new ArrayList<Employee>();

        personList.forEach(person -> employeeList.add(accountProcessor.create(person)));

        employeeList.forEach(System.out::println);
    }
}
