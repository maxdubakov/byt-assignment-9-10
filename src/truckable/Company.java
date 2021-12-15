package truckable;

import truckable.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Company extends User {

    private String name;
    private final List<Trip> trips;
    private final List<Vehicle> vehicles;
    private final List<Driver> drivers;

    public Company(Address address, String email, String password, String name) {
        super(address, email, password);
        this.name = name;
        this.trips = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.drivers = new ArrayList<>();
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public void removeTrip(Trip trip) {
        this.trips.remove(trip);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void removeDriver(Driver driver) {
        this.drivers.remove(driver);
    }

    /**
     * GETTERS
     */
    public String getName() {
        return name;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    /**
     * SETTERS
     */
    public void setName(String name) {
        this.name = name;
    }
}
