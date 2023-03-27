package core;

import model.Product;

public class CustomerThread extends Thread{
    private CustomerService customerService;
    private Product product;
    private int quantity;

    public CustomerThread(CustomerService customerService, Product product, int quantity){
        this.customerService=customerService;
        this.product=product;
        this.quantity=quantity;
    }

    public void run(){
        customerService.buyProduct(product,quantity);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
    }
}
