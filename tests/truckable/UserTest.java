package truckable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private String email, street, houseNumber;
    private int apartment;
    private Address address;


    @Before
    public void before() {
        street = "Konarskiego";
        houseNumber = "4b";
        apartment = 12;

        email = "email@gmail.com";
        address = new Address(street, houseNumber, apartment);
    }

    @Test
    public void constructorTest() {
        User user = new User(address, email);

        assertNotNull(user);
    }

    @Test
    public void gettersTest() {
        User user = new User(address, email);

        assertTrue(user.getId() > 0);
        assertEquals(address, user.getAddress());
        assertEquals(email, user.getEmail());
    }

    @Test
    public void settersTest() {
        User user = new User(address, email);

        assertEquals(address, user.getAddress());
        assertEquals(email, user.getEmail());

        String newStreet = "Grada";
        String newHouseNumber = "4a";
        int newApartment = 11;

        String newEmail = "emailNew@gmail.com";
        Address newAddress = new Address(newStreet, newHouseNumber, newApartment);

        user.setAddress(newAddress);
        user.setEmail(newEmail);

        assertEquals(newAddress, user.getAddress());
        assertEquals(newEmail, user.getEmail());
    }
}
