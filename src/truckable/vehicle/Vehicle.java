package truckable.vehicle;

import java.util.Date;
import java.util.Set;

public abstract class Vehicle {
    private static Set<String> registrationNumbers;

    private String registrationNumber;
    private String name;
    private Date yearOfProduction;
    private String requiredLicenceType;

    public Vehicle(String registrationNumber, String name, Date yearOfProduction, String requiredLicenceType) throws RegistrationNumberAlreadyInUseException {
        this.registrationNumber = checkRegistrationNumber(registrationNumber);
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.requiredLicenceType = requiredLicenceType;
    }

    public static Set<String> getRegistrationNumbers() {
        return registrationNumbers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Date getYearOfProduction() {
        return yearOfProduction;
    }

    public String getRequiredLicenceType() {
        return requiredLicenceType;
    }

    public String checkRegistrationNumber(String registrationNumber) throws RegistrationNumberAlreadyInUseException {
        if (Vehicle.registrationNumbers.contains(registrationNumber)) {
            Vehicle.registrationNumbers.add(registrationNumber);
            return registrationNumber;
        }
        throw new RegistrationNumberAlreadyInUseException();
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(Date yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setRequiredLicenceType(String requiredLicenceType) {
        this.requiredLicenceType = requiredLicenceType;
    }
}
