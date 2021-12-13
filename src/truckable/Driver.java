package truckable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver extends User {

    private String firstName;
    private String lastName;
    private final LocalDate dateOfBirth;
    private final List<License> licenses;

    public Driver(Address address, String email, String password, String firstName, String lastName, LocalDate dateOfBirth) {
        super(address, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.licenses = new ArrayList<>();
    }

    public void monitor() { }

    public void reportOnAnomalyBehaviour() { }

    public int addDriver(Driver driver) { return 1; }

    public int removeDriver(Driver driver) { return 1; }

    /**
     * GETTERS
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    /**
     * SETTERS
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
