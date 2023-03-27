package appui;

import core.CashierService;
import core.CustomerService;
import core.CustomerThread;
import dataaccess.ProductList;
import model.Cashier;
import model.Customer;

public class Store {
    public static void main(String[] args) {


        Customer customer1 = new Customer("cipher", "ci@pba.co.uk", 001);
        Customer customer2 = new Customer("ola", "ola@ola.co.uk", 007);
        Customer customer3 = new Customer("alo", "dsdf@ola.co.uk", 047);
        Customer customer4 = new Customer("loa", "fgh@ola.co.uk", 005);
        Customer customer5 = new Customer("sef", "sfs@ola.co.uk", 006);

        CustomerService customerService= new CustomerService(customer1);
        customerService.depositKpa(1500);
        CustomerService customerService1=new CustomerService(customer2);
        customerService1.depositKpa(120000);
        CustomerService customerService2=new CustomerService(customer3);
        customerService2.depositKpa(900000);
        CustomerService customerService3=new CustomerService(customer4);
        customerService3.depositKpa(813450);
        CustomerService customerService4=new CustomerService(customer5);
        customerService4.depositKpa(432203);
        CustomerThread customerThread11=new CustomerThread(customerService,ProductList.products.get(1), 5);
        CustomerThread customerThread12=new CustomerThread(customerService1,ProductList.products.get(0), 6);
        CustomerThread customerThread13=new CustomerThread(customerService2,ProductList.products.get(2), 7);
        CustomerThread customerThread14=new CustomerThread(customerService3,ProductList.products.get(3), 3);
        CustomerThread customerThread15=new CustomerThread(customerService4,ProductList.products.get(1), 5);
        CustomerThread customerThread16=new CustomerThread(customerService1,ProductList.products.get(0), 7);
        CustomerThread customerThread17=new CustomerThread(customerService2,ProductList.products.get(1), 8);
        CustomerThread customerThread18=new CustomerThread(customerService3,ProductList.products.get(2), 1);
        CustomerThread customerThread19=new CustomerThread(customerService4,ProductList.products.get(4), 2);
        CustomerThread customerThread=new CustomerThread(customerService,ProductList.products.get(1), 4);
        CustomerThread customerThread1=new CustomerThread(customerService1,ProductList.products.get(2), 2);
        CustomerThread customerThread2=new CustomerThread(customerService2,ProductList.products.get(2), 9);
        CustomerThread customerThread3=new CustomerThread(customerService3,ProductList.products.get(2), 3);
        CustomerThread customerThread4=new CustomerThread(customerService4,ProductList.products.get(2), 6);

        try {
            customerThread.start();
            customerThread.join();

            customerThread11.start();
            customerThread11.join();
            customerThread12.start();
            customerThread12.join();
            customerThread13.start();
            customerThread13.join();
            customerThread14.start();
            customerThread14.join();
            customerThread15.start();
            customerThread15.join();
            customerThread16.start();
            customerThread16.join();
            customerThread17.start();
            customerThread17.join();
            customerThread18.start();
            customerThread18.join();
            customerThread19.start();
            customerThread19.join();



            customerThread1.start();
            customerThread1.join();
            customerThread2.start();
            customerThread2.join();
            customerThread3.start();
            customerThread3.join();
            customerThread4.start();
            customerThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Cashier cashier1 = new Cashier("Solly", "solly@gmail.com", 01);
        CashierService cashierService= new CashierService(cashier1);

        cashierService.sellProductAndDispenseReceipt(customer1);
        cashierService.sellProductAndDispenseReceipt(customer2);
        cashierService.sellProductAndDispenseReceipt(customer3);
        cashierService.sellProductAndDispenseReceipt(customer4);



    }
}
