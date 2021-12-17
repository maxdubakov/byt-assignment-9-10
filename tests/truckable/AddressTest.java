package truckable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddressTest {

    private String expectedStreet, expectedHouseNumber;
    private int expectedApartment;

    @Before
    public void before() {
        expectedStreet = "Nakielska";
        expectedHouseNumber = "1C";
        expectedApartment = 366;
    }

    @Test
    public void constructorTest() {
        Address address = new Address(expectedStreet, expectedHouseNumber, expectedApartment);
        assertNotNull(address);
    }

    @Test
    public void gettersTest() {
        Address address = new Address(expectedStreet, expectedHouseNumber, expectedApartment);
        assertEquals(expectedStreet, address.getStreet());
        assertEquals(expectedHouseNumber, address.getHouseNumber());
        assertEquals(expectedApartment, address.getApartment());
    }

    @Test
    public void settersTest() {
        Address address = new Address(expectedStreet, expectedHouseNumber, expectedApartment);


        assertEquals(expectedStreet, address.getStreet());
        assertEquals(expectedHouseNumber, address.getHouseNumber());
        assertEquals(expectedApartment, address.getApartment());

        String newExpectedStreet = "Elektoralna";
        String newExpectedHouseNumber = "26";
        int newExpectedApartment = 62;

        address.setStreet(newExpectedStreet);
        address.setHouseNumber(newExpectedHouseNumber);
        address.setApartment(newExpectedApartment);

        assertEquals(newExpectedStreet, address.getStreet());
        assertEquals(newExpectedHouseNumber, address.getHouseNumber());
        assertEquals(newExpectedApartment, address.getApartment());
    }
}
