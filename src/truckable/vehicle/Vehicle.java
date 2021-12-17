package truckable.vehicle;

import truckable.Company;
import truckable.DriverVehicle;
import truckable.License;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Vehicle {
    private static final Set<String> registrationNumbers;

    private final String registrationNumber;
    private String name;
    private Integer yearOfProduction;
    private License requiredLicenceType;
    private final List<DriverVehicle> driverVehicles;
    private Company company;

    static {
        registrationNumbers = new HashSet<>();
    }

    public Vehicle(String registrationNumber, String name, Integer yearOfProduction, License requiredLicenceType, Company company) throws RegistrationNumberAlreadyInUseException {
        this.registrationNumber = checkRegistrationNumber(registrationNumber);
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.requiredLicenceType = requiredLicenceType;
        this.driverVehicles = new ArrayList<>();
        this.company = company;
    }

    public String checkRegistrationNumber(String registrationNumber) throws RegistrationNumberAlreadyInUseException {
        if (!Vehicle.registrationNumbers.contains(registrationNumber)) {
            Vehicle.registrationNumbers.add(registrationNumber);
            return registrationNumber;
        }
        throw new RegistrationNumberAlreadyInUseException();
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
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public License getRequiredLicenceType() {
        return requiredLicenceType;
    }

    public List<DriverVehicle> getDriverVehicles() {
        return driverVehicles;
    }

    public Company getCompany() {
        return company;
    }

    /**
     * SETTERS
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setRequiredLicenceType(License requiredLicenceType) {
        this.requiredLicenceType = requiredLicenceType;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
