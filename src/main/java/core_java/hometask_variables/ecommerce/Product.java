package core_java.hometask_variables.ecommerce;

public class Product {

    int productId;
    double price;
    int quantityOnHand;

    public Product(int quantityOnHand, double price, int productId) {
        this.quantityOnHand = quantityOnHand;
        this.price = price;
        this.productId = productId;
    }
}
