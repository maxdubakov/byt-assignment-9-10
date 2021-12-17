package truckable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Driver extends User {

    private String firstName;
    private String lastName;
    private final LocalDate dateOfBirth;
    private Company company;
    private final List<ObtainingData> obtainingDataList;
    private final List<DriverVehicle> driverVehicles;


    public Driver(Address address, String email, String firstName, String lastName, LocalDate dateOfBirth, Company company) {
        super(address, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.company = company;
        obtainingDataList = new ArrayList<>();
        driverVehicles = new ArrayList<>();
    }

    public void monitor() { }

    public void reportOnAnomalyBehaviour() { }

    public void addDriver(Driver driver) { }

    public void removeDriver(Driver driver) { }


    public void addObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.add(obtainingData);
    }

    public void removeObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.remove(obtainingData);
    }

    public void addDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicles.add(driverVehicle);
    }

    public void removeDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicles.remove(driverVehicle);
    }

    /**
     * GETTERS
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Company getCompany() {
        return company;
    }

    public List<ObtainingData> getObtainingDataList() {
        return obtainingDataList;
    }

    public List<DriverVehicle> getDriverVehicles() {
        return driverVehicles;
    }

    /**
     * SETTERS
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}