package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.ABCProductDAO;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        //Bad code... ToDp: will be resolved with Spring IoC ////////
        ProductService productService = new ProductManager(new ABCProductDAO(),
                new JLoggerManagerAdapter()){
        };

        Product product = new Product(1,2,"Elma",12, 50);
        productService.add(product);
    }
}
