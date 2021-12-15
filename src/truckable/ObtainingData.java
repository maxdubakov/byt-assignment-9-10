package truckable;

import java.util.Date;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class ObtainingData {
    private int serialNumber;
    private Date issueDate;
    private Date expireDate;
    private String country;

    private static Set<Integer> serialNumberSet = new HashSet<>();

    private License license;
    private Driver driver;

    public ObtainingData(int serialNumber, Date issueDate, Date expireDate, String country, License license, Driver driver){
        this.serialNumber = checkSerialNumber(serialNumber);
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.country = country;
        this.license = license;
        this.driver = driver;

        license.addObtainingData(this);
        driver.addObtainingData(this);
    }

    private Integer checkSerialNumber(int serialNumber){
        if(serialNumberSet.contains(serialNumber)){
            serialNumberSet.add(serialNumber);
            return serialNumber;
        }
        throw new InputMismatchException("Serial number already exists");
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public String getCountry() {
        return country;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
