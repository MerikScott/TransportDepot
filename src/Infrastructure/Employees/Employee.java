package Infrastructure.Employees;

public class Employee {
    private String name, surname;
    private Double salary;

    public Employee(String name, String surname, Double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
