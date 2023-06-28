package without;

public class Accounts {
    public Employee create(final Person person) {
        final var employee = new Employee();
        employee.setFirstName(person.getFirstName());
        employee.setLastName(person.getLastName());
        employee.setEmailAddress(String.format("%s%s.@gmail.com",
                employee.getFirstName().charAt(0), employee.getLastName()));

        switch (person.getEmployeeType()) {
            case Manager: {
                employee.setManager(true);
                break;
            }
            case Executive: {
                employee.setManager(true);
                employee.setExecutive(true);
                break;
            }
        }

        return employee;
    }
}
