package truckable;

import truckable.util.Helper;

import java.time.LocalDate;

public class ObtainingData {
    private static final Integer ID;

    private final int serialNumber;
    private LocalDate issueDate;
    private LocalDate expireDate;
    private String country;

    private final License license;
    private final Driver driver;

    static {
        ID = 1;
    }

    public ObtainingData(LocalDate issueDate, LocalDate expireDate, String country, License license, Driver driver) {
        this.serialNumber = Helper.getUniqueID(ID);
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.country = country;
        this.license = license;
        this.driver = driver;

        license.addObtainingData(this);
        driver.addObtainingData(this);
    }

    /**
     * GETTERS
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public String getCountry() {
        return country;
    }

    public License getLicense() {
        return license;
    }

    public Driver getDriver() {
        return driver;
    }

    /**
     * SETTERS
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
