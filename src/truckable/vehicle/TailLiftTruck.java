package truckable.vehicle;

import java.util.Date;

public class TailLiftTruck extends Vehicle {
    public TailLiftTruck(String registrationNumber, String name, Date yearOfProduction, String requiredLicenceType) throws RegistrationNumberAlreadyInUseException {
        super(registrationNumber, name, yearOfProduction, requiredLicenceType);
    }
}
