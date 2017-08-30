package Infrastructure.Vehicles;

import Infrastructure.Employees.VehicleDriver;
import Infrastructure.TransmitterGSM;

public class Vehicle {

    private String registrationPlate;
    private String make;
    private Double weight;
    private Integer maxCargoLoad;
    private Integer maxPeopleLoad;
    private Integer mileage;
    private TransmitterGSM transmitter;
    private VehicleDriver driver;

    public Vehicle(String registrationPlate, String make, Double weight, Integer mileage) {
        this.registrationPlate = registrationPlate;
        this.make = make;
        this.weight = weight;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() +
                " " + registrationPlate +
                " " + make +
                ", weight=" + weight +
                ", mileage=" + mileage +
                ", transmitter=" + transmitter +
                ", driver=" + driver ;
    }

}
