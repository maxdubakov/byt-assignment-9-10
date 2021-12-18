package truckable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {

    private Address expectedAddress;
    private String expectedEmail, expectedName;

    @Before
    public void before() {
        expectedAddress = new Address("Street", "House No", 10);
        expectedEmail = "max@gmail.com";
        expectedName = "Maximich";
    }

    @Test
    public void constructorTest() {
        Company company = new Company(expectedAddress, expectedEmail, expectedName);
        assertNotNull(company);
    }

    @Test
    public void gettersTest() {
        Company company = new Company(expectedAddress, expectedEmail, expectedName);

        assertEquals(expectedAddress, company.getAddress());
        assertEquals(expectedEmail, company.getEmail());
        assertEquals(expectedName, company.getName());
        assertNotNull(company.getTrips());
        assertNotNull(company.getDrivers());
        assertNotNull(company.getVehicles());
    }

    @Test
    public void settersTest() {
        Company company = new Company(expectedAddress, expectedEmail, expectedName);

        assertEquals(expectedAddress, company.getAddress());
        assertEquals(expectedEmail, company.getEmail());
        assertEquals(expectedName, company.getName());

        Address newExpectedAddress = new Address("New Street", "New house", 15);
        String newExpectedEmail = "new@gmail.com";
        String newExpectedName = "New";

        company.setAddress(newExpectedAddress);
        company.setEmail(newExpectedEmail);
        company.setName(newExpectedName);

        assertEquals(newExpectedAddress, company.getAddress());
        assertEquals(newExpectedEmail, company.getEmail());
        assertEquals(newExpectedName, company.getName());
    }
}
