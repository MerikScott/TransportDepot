package Infrastructure.Employees;

public class VehicleDriver extends Employee {

    public VehicleDriver(String name, String surname, Double salary, Boolean available) {
        super(name, surname, salary, available);
    }

    public VehicleDriver(String name, String surname, Boolean available) {
        super(name, surname, available);
    }


}
