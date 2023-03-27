package core;

import dataaccess.ProductList;
import model.Customer;
import model.Product;

public class CustomerService {
    private Customer customer;


    public CustomerService(Customer customer){

        this.customer=customer;

    }
    public synchronized void buyProduct(Product product, int quantity){

        if (!ProductList.products.contains(product)) return;
        if(quantity>product.getQuantity()){
            System.err.println("Exceeded Quantity available in stock");
            return;
        }
        System.out.println("Purchase successful: Product: "+ product.getpName()+"\n Quantity: "+ quantity);
        customer.setProducts(new Product(product.getpName(), product.getCategory(), quantity, product.getPrice()));

        product.setQuantity(quantity);

    }


    public void depositKpa(double balance){
        customer.setBalance(customer.getBalance()+balance);


    }
}
