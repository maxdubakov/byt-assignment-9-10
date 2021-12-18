package truckable;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DriverTest {

    private String expectedFirstName, expectedLastName, expectedEmail;
    private LocalDate expectedDateOfBirth;
    private Company expectedCompany;
    private Address expectedAddress;

    @Before
    public void before() {
        expectedFirstName = "Max";
        expectedLastName = "Dubakov";
        expectedEmail = "driver@gmail.com";
        expectedDateOfBirth = LocalDate.of(2002, 2, 1);
        expectedAddress = new Address("Street", "House No", 10);
        expectedCompany = new Company(new Address("Street", "House No", 10), "max@gmail.com", "Maximich");
    }

    @Test
    public void constructTest() {
        Driver driver = new Driver(expectedAddress, expectedEmail, expectedFirstName, expectedLastName, expectedDateOfBirth, expectedCompany);
        assertNotNull(driver);
    }

    @Test
    public void gettersTest() {
        Driver driver = new Driver(expectedAddress, expectedEmail, expectedFirstName, expectedLastName, expectedDateOfBirth, expectedCompany);

        assertEquals(expectedFirstName, driver.getFirstName());
        assertEquals(expectedLastName, driver.getLastName());
        assertEquals(expectedDateOfBirth, driver.getDateOfBirth());
        assertEquals(expectedCompany, driver.getCompany());
        assertNotNull(driver.getObtainingDataList());
        assertNotNull(driver.getDriverVehicles());
    }

    @Test
    public void settersTest() {
        Driver driver = new Driver(expectedAddress, expectedEmail, expectedFirstName, expectedLastName, expectedDateOfBirth, expectedCompany);

        assertEquals(expectedFirstName, driver.getFirstName());
        assertEquals(expectedLastName, driver.getLastName());
        assertEquals(expectedDateOfBirth, driver.getDateOfBirth());
        assertEquals(expectedCompany, driver.getCompany());

        String newExpectedFirstName = "John";
        String newExpectedLastName = "Doe";
        Company newExpectedCompany = new Company(new Address("new street", "new house no", 1), "new@gmail.com", "New");

        driver.setFirstName(newExpectedFirstName);
        driver.setLastName(newExpectedLastName);
        driver.setCompany(newExpectedCompany);

        assertEquals(newExpectedFirstName, driver.getFirstName());
        assertEquals(newExpectedLastName, driver.getLastName());
        assertEquals(newExpectedCompany, driver.getCompany());
    }
}
