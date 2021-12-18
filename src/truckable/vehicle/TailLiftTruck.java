package truckable.vehicle;

import truckable.Company;
import truckable.License;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;

public class TailLiftTruck extends Vehicle {
    public TailLiftTruck(String registrationNumber, String name, Integer yearOfProduction, License requiredLicenceType, Company company) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType, company);
    }
}
