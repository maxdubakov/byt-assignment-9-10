package truckable.vehicle;

import truckable.Company;
import truckable.License;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;

import java.time.LocalDate;

public class SemiTrailer extends Vehicle{
    public SemiTrailer(String registrationNumber, String name, Integer yearOfProduction, License requiredLicenceType, Company company) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType, company);
    }
}
