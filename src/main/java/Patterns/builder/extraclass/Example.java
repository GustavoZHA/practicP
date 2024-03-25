package Patterns.builder.extraclass;

public class Example {

    public void example1() {
        Employee employee = new Employee("Anuthan", "Chennai", "1736", false);

        Employee employee1 = EmployeeBuilder.builder()
                .setName("Amuthan")
                .setAddress("Mumbai")
                .setId("949")
                .buildEmployee();

        EmployeeBuilder employeeBuilder = new EmployeeBuilder()
                .setAddress("Anuthan")
                .setAddress("Chennai")
                .build();

        Employee employee2 = new EmployeeBuilder()
                .setName("Amuthan")
                .setAddress("Mumbai")
                .setId("949")
                .buildEmployee();

        Employee employee3 = EmployeeBuilder.builder()
                .setName("Amuthan")
                .and()
                .setAddress("Mumbai")
                .with()
                .setId("949")
                .buildEmployee();
    }
}
