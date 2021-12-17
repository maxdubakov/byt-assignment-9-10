package truckable.vehicle;

import truckable.Company;
import truckable.License;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;

public class RefrigeratedTruck extends Vehicle {
    public RefrigeratedTruck(String registrationNumber, String name, Integer yearOfProduction, License requiredLicenceType, Company company) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType, company);
    }
}
