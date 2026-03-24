package collections.iterating_collections;

public class Main {
    public static void main(String[] args) {
        NewPostOffice office = new NewPostOffice();
        office.addBox("John", "Alex", 5, 0.1, 100);
        office.addBox("Mary", "Alex", 2, 0.05, 150);
        office.addBox("David", "Bob", 3, 0.08, 100);

        System.out.println("All parcels: ");
        System.out.println(office.getListBox());

        System.out.println(office.deliveredToRecipient("Alex"));
        office.declineCostOfBox(10);
        System.out.println(office.getListBox());
    }
}
