package core_java.hometask_variables.ecommerce;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p){
        products.add(p);
        System.out.println(p.productId);
    }

    void removeProduct(int id){
        for(Product p : products){
            if(p.productId==id){
                products.remove(id);
                System.out.println(p.productId);
                break;
            }
        }
    }

    void calculateTotal(){
        double total =0;

        for(Product p : products){
            total = total+p.price;

            System.out.println(total);
        }
    }








}
