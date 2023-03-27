package model;

//import lombok.Data;
//
//@Data
public class Cashier {
    private String name;
    private String email;
    private int cashierID;

    public Cashier(String name, String email, int cashierID) {
        this.name = name;
        this.email = email;
        this.cashierID = cashierID;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cashierID=" + cashierID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCashierID() {
        return cashierID;
    }

    public void setCashierID(int cashierID) {
        this.cashierID = cashierID;
    }
}
