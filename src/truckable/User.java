package truckable;

import truckable.util.Helper;

public class User {
    private final static Integer ID;

    private final int id;
    private Address address;
    private String email;


    static {
        ID = 1;
    }

    public User(Address address, String email) {
        this.id = Helper.getUniqueID(ID);
        this.address = address;
        this.email = email;
    }

    public void signIn(Address address, String email, String password) { }

    public void logIn(String email, String password) { }

    public void editData(Address newAddress, String newEmail, String password) { }

    public void sendMessage(String message) { }

    /**
     * GETTERS
     */
    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }


    /**
     * SETTERS
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
