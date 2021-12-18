package truckable;

import org.junit.Before;
import org.junit.Test;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;
import truckable.vehicle.SemiTrailer;
import truckable.vehicle.Vehicle;

import static org.junit.Assert.*;

public class VehicleTest {

    private static String uniqueId = "1";

    private String registrationNumber, name;
    private int year;
    private License requiredLicenceType;
    private Company company;

    @Before
    public void before() {
        Address address = new Address("Konarskiego", "4b", 12);

        uniqueId = uniqueId.concat("1");
        registrationNumber = uniqueId;
        name = "Max";
        year = 2001;
        requiredLicenceType = new License("type", "Name1");
        company = new Company(address, "email@gmail.com", "Company");
    }

    @Test
    public void constructorTest() throws RegistrationNumberAlreadyInUseException {
        Vehicle vehicle = new SemiTrailer(registrationNumber, name, year, requiredLicenceType, company);

        assertNotNull(vehicle);
    }

    @Test
    public void gettersTest() throws RegistrationNumberAlreadyInUseException {
        Vehicle vehicle = new SemiTrailer(registrationNumber, name, year, requiredLicenceType, company);

        assertEquals(registrationNumber, vehicle.getRegistrationNumber());
        assertEquals(name, vehicle.getName());
        assertEquals(year, vehicle.getYearOfProduction().intValue());
        assertEquals(requiredLicenceType, vehicle.getRequiredLicenceType());
        assertEquals(company, vehicle.getCompany());
        assertNotNull(vehicle.getDriverVehicles());
    }

    @Test
    public void settersTest() throws RegistrationNumberAlreadyInUseException {
        Vehicle vehicle = new SemiTrailer(registrationNumber, name, year, requiredLicenceType, company);

        assertEquals(registrationNumber, vehicle.getRegistrationNumber());
        assertEquals(name, vehicle.getName());
        assertEquals(year, vehicle.getYearOfProduction().intValue());
        assertEquals(requiredLicenceType, vehicle.getRequiredLicenceType());
        assertEquals(company, vehicle.getCompany());

        Address address = new Address("Konarskiego", "4b", 12);

        String newName = "So";
        int newYear = 2010;
        License newRequiredLicenceType  = new License("newType", "newName1");
        Company newCompany = new Company(address, "newEmail@gmail.com", "Company");

        vehicle.setName(newName);
        vehicle.setYearOfProduction(newYear);
        vehicle.setRequiredLicenceType(newRequiredLicenceType);
        vehicle.setCompany(newCompany);

        assertEquals(newName, vehicle.getName());
        assertEquals(newYear, vehicle.getYearOfProduction().intValue());
        assertEquals(newRequiredLicenceType, vehicle.getRequiredLicenceType());
        assertEquals(newCompany, vehicle.getCompany());

    }
}
