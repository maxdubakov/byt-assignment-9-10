package truckable;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ObtainingDataTest {

    private LocalDate issueDate, expireDate;
    private String country;
    private License license;
    private Driver driver;

    @Before
    public void before() {
        Address address = new Address("Konarskiego", "4b", 12);
        Company company = new Company(address, "email@gmail.com", "Company");


        issueDate = LocalDate.of(2020, 10, 12);
        expireDate = LocalDate.of(2020, 10, 13);
        country = "Pol";
        license = new License("type", "name");
        driver = new Driver(address, "am@gmail.com", "Vlad", "Kotyk", LocalDate.of(2021, 10, 12), company);
    }

    @Test
    public void constructorTest() throws Exception {
        ObtainingData obtainingData = new ObtainingData(issueDate, expireDate, country, license, driver);

        assertNotNull(obtainingData);
    }

    @Test
    public void gettersTest() throws Exception {
        ObtainingData obtainingData = new ObtainingData(issueDate, expireDate, country, license, driver);

        assertTrue(obtainingData.getSerialNumber() > 0);
        assertEquals(issueDate, obtainingData.getIssueDate());
        assertEquals(expireDate, obtainingData.getExpireDate());
        assertEquals(country, obtainingData.getCountry());
        assertEquals(license, obtainingData.getLicense());
        assertEquals(driver, obtainingData.getDriver());
    }

    @Test
    public void settersTest() throws Exception {
        ObtainingData obtainingData = new ObtainingData(issueDate, expireDate, country, license, driver);

        assertTrue(obtainingData.getSerialNumber() > 0);
        assertEquals(issueDate, obtainingData.getIssueDate());
        assertEquals(expireDate, obtainingData.getExpireDate());
        assertEquals(country, obtainingData.getCountry());
        assertEquals(license, obtainingData.getLicense());
        assertEquals(driver, obtainingData.getDriver());

        LocalDate newIssueDate = LocalDate.of(2020, 10, 11);
        LocalDate newExpireDate = LocalDate.of(2020, 10, 12);
        String newCountry = "Ukr";

        obtainingData.setIssueDate(newIssueDate);
        obtainingData.setExpireDate(newExpireDate);
        obtainingData.setCountry(newCountry);
    }
}
