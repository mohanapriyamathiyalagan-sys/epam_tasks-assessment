package core_java.hometask_basics.pizza_hut;

public class Pizza {
    String size;
    String base;

    public Pizza(String size, String base) {
        this.size = size;
        this.base = base;
    }

    void showPizza(){
        System.out.println("Size: "+size);
        System.out.println("Base: "+base);
    }
}
