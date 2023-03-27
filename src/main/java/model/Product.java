package model;

public class Product {
    private String pName;
    private String category;
    private int quantity;
    private double price;


    public Product(String pName, String category,int quantity, double price) {
        this.pName = pName;
        this.category = category;
        this.quantity=quantity;
        this.price = price;
    }
    @Override
    public String toString() {

        return   "Product==>" +
                "Product name='" + pName +
                ", Quantity=" + quantity  +
                ", Price= " + price +"  "
                ;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
