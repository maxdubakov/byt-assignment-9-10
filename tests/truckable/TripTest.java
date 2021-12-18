package truckable;

import org.junit.Before;
import org.junit.Test;
import truckable.vehicle.SemiTrailer;
import truckable.vehicle.Vehicle;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TripTest {
    private static String uniqueId = "1";
    private String tripName;
    private LocalDate dateFrom, dateTo;
    private DriverVehicle driverVehicle;
    private Company company;

    @Before
    public void before() throws Exception {
        Address address = new Address("Konarskiego", "4b", 12);
        License license = new License("type1", "name1");

        tripName = "BadTrip";
        dateFrom = LocalDate.of(2020, 10, 12);
        dateTo = LocalDate.of(2020, 10, 13);
        company = new Company(address, "email@gmail.com", "Company");

        Driver driver = new Driver(address, "am@gmail.com", "Vlad", "Kotyk", LocalDate.of(2021, 10, 12), company);
        ObtainingData obtainingData = new ObtainingData(LocalDate.of(2008, 3, 12), LocalDate.of(2030, 3, 12), "Ukr", license, driver);
        driver.addObtainingData(obtainingData);
        uniqueId = uniqueId.concat("1");
        Vehicle vehicle = new SemiTrailer(uniqueId, "Bug", 2002, license, company);

        driverVehicle = new DriverVehicle(driver, vehicle);
    }

    @Test
    public void constructorTest() throws Exception {
        Trip trip = new Trip(tripName, dateFrom, dateTo, driverVehicle, company);
        assertNotNull(trip);
    }

    @Test
    public void gettersTest() throws Exception {
        Trip trip = new Trip(tripName, dateFrom, dateTo, driverVehicle, company);

        assertTrue(trip.getIdTrip() > 0);
        assertEquals(tripName, trip.getTripName());
        assertEquals(dateFrom, trip.getDateFrom());
        assertEquals(dateTo, trip.getDateTo());
        assertEquals(driverVehicle, trip.getDriverVehicle());
        assertEquals(company, trip.getCompany());
        assertNotNull(trip.getRoutes());
    }

    @Test
    public void settersTest() throws Exception {
        Trip trip = new Trip(tripName, dateFrom, dateTo, driverVehicle, company);

        assertEquals(tripName, trip.getTripName());
        assertEquals(dateFrom, trip.getDateFrom());
        assertEquals(dateTo, trip.getDateTo());
        assertEquals(driverVehicle, trip.getDriverVehicle());
        assertEquals(company, trip.getCompany());

        Address address = new Address("Konarskiego", "4b", 12);
        License license = new License("type1", "name1");

        String newTripName = "NewTrip";
        LocalDate newDateFrom = LocalDate.of(2020, 10, 11);
        LocalDate newDateTo = LocalDate.of(2020, 10, 14);
        Company newCompany = new Company(address, "email@gmail.com", "Company1");

        Driver driver = new Driver(address, "am@gmail.com", "Irka", "Kotyk", LocalDate.of(2021, 10, 12), company);
        ObtainingData obtainingData = new ObtainingData(LocalDate.of(2007, 3, 12), LocalDate.of(2030, 3, 12), "Ukr", license, driver);
        driver.addObtainingData(obtainingData);
        Vehicle vehicle = new SemiTrailer("New", "Bug", 2002, license, company);
        DriverVehicle newDriverVehicle = new DriverVehicle(driver, vehicle);


        trip.setTripName(newTripName);
        trip.setDateFrom(newDateFrom);
        trip.setDateTo(newDateTo);
        trip.setDriverVehicle(newDriverVehicle);
        trip.setCompany(newCompany);

        assertEquals(newTripName, trip.getTripName());
        assertEquals(newDateFrom, trip.getDateFrom());
        assertEquals(newDateTo, trip.getDateTo());
        assertEquals(newDriverVehicle, trip.getDriverVehicle());
        assertEquals(newCompany, trip.getCompany());
    }
}
