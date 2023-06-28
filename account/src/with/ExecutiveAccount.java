package with;

public class ExecutiveAccount implements IAccounts {
    @Override
    public Employee create(IPerson person) {
        final var employee = new Employee();
        employee.setFirstName(person.getFirstName());
        employee.setLastName(person.getLastName());
        employee.setEmailAddress(String.format("%s%s.@google.com",
                employee.getFirstName().charAt(0), employee.getLastName()));
        employee.setManager(true);
        employee.setExecutive(true);

        return employee;
    }
}
