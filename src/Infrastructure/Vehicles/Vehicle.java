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
    private Boolean available;

    public Vehicle(String registrationPlate, String make, Double weight, Integer mileage, Boolean available) {
        this.registrationPlate = registrationPlate;
        this.make = make;
        this.weight = weight;
        this.mileage = mileage;
        this.available = available;
    }

    public Vehicle() {

    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() +
                " " + registrationPlate +
                " " + make +
                ", weight=" + weight +
                ", mileage=" + mileage +
                ", transmitter=" + transmitter +
               // ", driver=" + driver +
                ", available=" + available;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public String getMake() {
        return make;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getMaxCargoLoad() {
        return maxCargoLoad;
    }

    public Integer getMaxPeopleLoad() {
        return maxPeopleLoad;
    }

    public Integer getMileage() {
        return mileage;
    }

    public TransmitterGSM getTransmitter() {
        return transmitter;
    }

    public VehicleDriver getDriver() {
        return driver;
    }

    public void setTransmitter(TransmitterGSM transmitter) {
        this.transmitter = transmitter;
    }

    public void setDriver(VehicleDriver driver) {
        this.driver = driver;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
