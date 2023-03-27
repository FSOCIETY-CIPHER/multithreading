package model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private int customerID;
    private double balance;
    private ArrayList<Product> products;


    public Customer(String name, String email, int customerID) {
        this.name = name;
        this.email = email;
        this.customerID = customerID;
        this.products = new ArrayList<>();
        this.balance=0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", customerID=" + customerID +
                ", balance=" + balance +
                ", products=" + products +
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product prod) {
        this.products.add(prod);
    }
}
