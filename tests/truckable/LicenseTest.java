package truckable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseTest {

    private String expectedType, expectedName;

    @Before
    public void before() {
        expectedType = "A";
        expectedName = "Moped";
    }

    @Test
    public void constructorTest() {
        License license = new License(expectedType, expectedName);
        assertNotNull(license);
    }

    @Test
    public void gettersTest() {
        License license = new License(expectedType, expectedName);

        assertEquals(expectedType, license.getType());
        assertEquals(expectedName, license.getName());
    }

    @Test
    public void settersTest() {
        // there is no setters in License class
    }
}
