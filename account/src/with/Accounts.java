package with;

public class Accounts implements IAccounts {
    public Employee create(final IPerson person) {
        final var employee = new Employee();
        employee.setFirstName(person.getFirstName());
        employee.setLastName(person.getLastName());
        employee.setEmailAddress(String.format("%s%s.@gmail.com",
                employee.getFirstName().charAt(0), employee.getLastName()));

        return employee;
    }
}
