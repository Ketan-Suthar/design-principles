package with;

import java.util.ArrayList;

public class WithDriver {
    public static void main(String[] args) {
        final var personList = new ArrayList<IPerson>();
        personList.add(new Person("Monkey", "Luffy"));
        personList.add(new Executive("Edward", "NewGate"));
        personList.add(new Manager("Akagami", "Shanks"));

        final var employeeList = new ArrayList<Employee>();

        personList.forEach(person ->
                employeeList.add(person.getAccountProcessor().create(person)));

        employeeList.forEach(System.out::println);
    }
}
