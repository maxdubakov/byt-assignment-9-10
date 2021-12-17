package truckable;

import truckable.exceptions.InappropriateLicenseException;
import truckable.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class DriverVehicle {
    private Driver driver;
    private Vehicle vehicle;
    private final List<Trip> trips;

    public DriverVehicle(Driver driver, Vehicle vehicle) throws InappropriateLicenseException {
        if (!driverHasAppropriateLicence(driver, vehicle)) {
            throw new InappropriateLicenseException();
        }
        this.driver = driver;
        this.vehicle = vehicle;
        this.trips = new ArrayList<>();
    }

    private boolean driverHasAppropriateLicence(Driver driver, Vehicle vehicle) {
        return driver
                .getObtainingDataList()
                .stream()
                .map(ObtainingData::getLicense)
                .anyMatch(l -> l.equals(vehicle.getRequiredLicenceType()));
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void removeTrip(Trip trip) {
        this.trips.remove(trip);
    }

    /**
     * GETTERS
     */
    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    /**
     * SETTERS
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
