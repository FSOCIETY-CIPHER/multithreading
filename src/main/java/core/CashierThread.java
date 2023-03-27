package core;

import model.Cashier;
import java.util.*;
import model.Customer;

public class CashierThread extends Thread{
    private Customer customer;
    private CashierService cashierService;

    public CashierThread(CashierService cashierService, Customer customer){
        this.cashierService=cashierService;
        this.customer= customer;
    }
    public void run(){
        cashierService.sellProductAndDispenseReceipt(customer);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
