package truckable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import truckable.exceptions.InappropriateLicenseException;
import truckable.exceptions.InvalidDatesException;
import truckable.exceptions.RegistrationNumberAlreadyInUseException;
import truckable.vehicle.SemiTrailer;
import truckable.vehicle.Vehicle;

import java.time.LocalDate;

public class DriverVehicleTest {

    private static String uniqueId = "1";

    private static Driver expectedDriver;
    private static Vehicle expectedVehicle;


    @Before
    public void before() throws RegistrationNumberAlreadyInUseException, InvalidDatesException, InappropriateLicenseException {
        expectedDriver = new Driver(
                new Address("Street", "House No", 10),
                "max@gmail.com",
                "Maximich",
                "Dubakov",
                LocalDate.of(2002, 2, 1),
                new Company(new Address("Street", "House No", 10), "max@gmail.com", "Maximich"));
        expectedDriver.addObtainingData(new ObtainingData(LocalDate.of(1992, 2, 5), LocalDate.of(2022, 10, 5), "Belarus", new License("type", "name"), expectedDriver));

        uniqueId = uniqueId.concat("1");
        expectedVehicle = new SemiTrailer(
                uniqueId,
                "Maximich Trailer",
                1998,
                new License("type", "name"),
                new Company(new Address("Street", "House No", 10), "max@gmail.com", "Maximich"));
        expectedVehicle.setRequiredLicenceType(new License("type", "name"));

    }

    @Test
    public void constructorTest() throws InappropriateLicenseException {
        DriverVehicle driverVehicle = new DriverVehicle(expectedDriver, expectedVehicle);
        assertNotNull(driverVehicle);
    }

    @Test
    public void gettersTest() throws InappropriateLicenseException {
        DriverVehicle driverVehicle = new DriverVehicle(expectedDriver, expectedVehicle);
        assertEquals(expectedDriver, driverVehicle.getDriver());
        assertEquals(expectedVehicle, driverVehicle.getVehicle());
    }

    @Test
    public void settersTest() throws InappropriateLicenseException, RegistrationNumberAlreadyInUseException {
        DriverVehicle driverVehicle = new DriverVehicle(expectedDriver, expectedVehicle);

        assertEquals(expectedDriver, driverVehicle.getDriver());
        assertEquals(expectedVehicle, driverVehicle.getVehicle());

        Driver newExpectedDriver = new Driver(new Address("New", "House No New", 15),
                "new@gmail.com",
                "New",
                "Very New",
                LocalDate.of(2001, 10, 15),
                new Company(new Address("New New", "House No N", 10), "new@gmail.com", "New"));

        Vehicle newExpectedVehicle  = new SemiTrailer(
                "12345328783492",
                "New Maximich Trailer",
                1948,
                new License("type", "name"),
                new Company(new Address("Street", "House No", 10), "max@gmail.com", "Maximich"));

        driverVehicle.setDriver(newExpectedDriver);
        driverVehicle.setVehicle(newExpectedVehicle);

        assertEquals(newExpectedDriver, driverVehicle.getDriver());
        assertEquals(newExpectedVehicle, driverVehicle.getVehicle());
    }
}
