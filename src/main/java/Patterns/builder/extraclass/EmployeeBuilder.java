package Patterns.builder.extraclass;

public class EmployeeBuilder {
    private String name;
    private String address;
    private String id;
    private boolean isContractor;

    public EmployeeBuilder() {
    }

    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }


    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setContractor(boolean contractor) {
        isContractor = contractor;
        return this;
    }

    public EmployeeBuilder build() {
        return this;
    }

    public Employee buildEmployee() {
        return new Employee(name,address,id,isContractor);
    }

    public EmployeeBuilder and() {
        return this;
    }
    public EmployeeBuilder with() {
        return this;
    }
}
