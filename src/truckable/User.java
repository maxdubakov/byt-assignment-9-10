package truckable;

public class User {
    private static int ID;

    private final int id;
    private Address address;
    private String email;
    private String password;


    static {
        ID = 1;
    }

    public User(Address address, String email, String password) {
        this.id = getUniqueID();
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public void signIn(Address address, String email, String password) { }

    public void logIn(String email, String password) { }

    public void editData(Address newAddress, String newEmail, String password) { }

    public void sendMessage(String message) { }

    private int getUniqueID() {
        ID++;
        return ID;
    }

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

    public String getPassword() {
        return password;
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

    public void setPassword(String password) {
        this.password = password;
    }
}
