package truckable;

public class Address {
    private String street;
    private String houseNumber;
    private int apartment;

    public Address(String street, String houseNumber, int apartment) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
    }

    /*
     *GETTERS
     */

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getApartment() {
        return apartment;
    }

    /*
     *SETTERS
     */

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}