package App;

import Environment.Place;
import Infrastructure.Employees.VehicleDriver;
import Infrastructure.TransmitterGSM;
import Infrastructure.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SystemOperator {


    public static void findVehicle(List<Vehicle> vehiclesInUseList , String driverSurname) {
        Boolean vehicleFound = false;

        for (Vehicle vehicle : vehiclesInUseList) {
            if (vehicle.getDriver().getSurname().equals(driverSurname)) {
                System.out.println("Vehicle driven by " + driverSurname +
                        " found at " + vehicle.getTransmitter().getLatitude() +
                        " N, " + vehicle.getTransmitter().getLongitude() + " E");
                vehicleFound = true;
                break;
            }
        }
        if (!vehicleFound) {
            System.out.println("No vehicle driven by " + driverSurname + " found.");
        }
    }

    public static Integer sendVehicle (List<Vehicle> vehiclesList, Integer vehicleToSend,
                             List<VehicleDriver> driversList, Integer driverToSend,
                             List<TransmitterGSM> transmittersList, Integer nextTransmitter,
                             List<Place> placesList) {
        vehiclesList.get(vehicleToSend).setAvailable(false); // not available any more
        vehiclesList.get(vehicleToSend).setDriver(driversList.get(driverToSend)); // driver binded
        driversList.get(driverToSend).setAvailable(false); // not available any more
        vehiclesList.get(vehicleToSend).setTransmitter(transmittersList.get(nextTransmitter));
        transmittersList.get(nextTransmitter).setLatitude(placesList.get(0).getLatitude());
        transmittersList.get(nextTransmitter).setLongitude(placesList.get(0).getLongitude());
        nextTransmitter++;
        return nextTransmitter;
    }

    public static Integer depotVehicles(List<Vehicle> vehiclesList) {
        Integer availableVehicles = 0;
        for (Vehicle vehicle : vehiclesList ) {
            if (vehicle.getAvailable()) {
                availableVehicles++;
            }
        }
        return availableVehicles;
    }

    public static void removeVehicle(List<Vehicle> vehicleList, String registrationPlate) {
        int recordToRemove = -1;
        for (Vehicle vehicle : vehicleList) {
            recordToRemove++;
            System.out.println("Record to remove " + recordToRemove);
            if (vehicle.getRegistrationPlate().equals(registrationPlate)) {
                System.out.println("Vehicle with registration " + registrationPlate + " found");
                vehicleList.remove(recordToRemove);
                break;
            }

        }
    }

}

