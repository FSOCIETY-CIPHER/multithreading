package core;
import model.Cashier;
import model.Customer;
import model.Product;

import java.util.ArrayList;

public class CashierService {
    private Cashier cashier;

    public CashierService(Cashier cashier){
        this.cashier=cashier;
    }
    public void sellProductAndDispenseReceipt(Customer customer){
        ArrayList<Product> a = customer.getProducts();
        int customerAmount=0;
        int productTotPrice=0;
        int b =0;
        for(Product product : a){
            customerAmount+=product.getPrice() * product.getQuantity();
        }
        if(customerAmount>customer.getBalance()){
            System.err.println("\n\nDear "+customer.getName()+", you are broke, collect loan");return;
        }
        customer.setBalance(customer.getBalance()-customerAmount);
        System.out.println("\n\n"+"Dear "+customer.getName()+", your payment was successful\n\n");
        System.out.println("====================================Reciept========================");
        for(Product product: customer.getProducts()){
            System.out.println("\t"+ product.toString() + "Total = "+product.getPrice()* product.getQuantity());
            productTotPrice+=(product.getPrice()*product.getQuantity());
        }
        System.out.println("Total Cost : " +productTotPrice);
        System.out.println(customer.getName() + " Balance : "+customer.getBalance());



    }

}
