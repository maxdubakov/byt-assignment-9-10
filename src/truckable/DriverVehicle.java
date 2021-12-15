package truckable;

import truckable.vehicle.Vehicle;

import java.util.List;

public class DriverVehicle {
    private Driver driver;
    private Vehicle vehicle;
    private List<Trip> trips;

    public DriverVehicle(Driver driver, Vehicle vehicle) {
        this.driver = driver;
        this.vehicle = vehicle;
    }


    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
