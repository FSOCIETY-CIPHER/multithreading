package dataaccess;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product("cake","junks",100, 250));
        products.add(new Product("sweets","junks", 55, 175));
        products.add(new Product("oil", "groceries", 30, 6000));
        products.add(new Product("water", "groceries", 200, 200));
        products.add(new Product("butter", "groceries", 40, 5500));
    }
}
