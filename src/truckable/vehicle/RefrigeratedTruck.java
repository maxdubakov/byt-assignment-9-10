package truckable.vehicle;

import truckable.Company;
import truckable.License;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;

import java.time.LocalDate;

public class RefrigeratedTruck extends Vehicle {
    public RefrigeratedTruck(String registrationNumber, String name, LocalDate yearOfProduction, License requiredLicenceType, Company company) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType, company);
    }
}
