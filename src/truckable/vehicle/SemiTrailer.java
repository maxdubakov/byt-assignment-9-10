package truckable.vehicle;

import java.util.Date;

public class SemiTrailer extends Vehicle{
    public SemiTrailer(String registrationNumber, String name, Date yearOfProduction, String requiredLicenceType) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType);
    }
}
