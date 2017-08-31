package Infrastructure.Employees;

public class Employee {
    private String name, surname;
    private Double salary;
    private Boolean available;

    public Employee(String name, String surname, Double salary, Boolean available) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.available = available;
    }

    public Employee(String name, String surname, Boolean available) {
        this.name = name;
        this.surname = surname;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() +
                " name=" + name +
                ", surname=" + surname +
                ", salary= " + salary +
                ", available= " + available +
                '}';
    }
}
