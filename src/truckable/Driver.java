package truckable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Driver {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    private List<ObtainingData> obtainingDataList;

    public Driver(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        obtainingDataList = new ArrayList<>();
    }

    public void addObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.add(obtainingData);
    }

    public String monitor(){
        return "Driver's location";
    }

    public String reportOnAnomalyBehavior(){
        return "Anomaly behavior is detected";
    }

    public void addDriver(){}

    public void deleteDriver(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
