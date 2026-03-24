package collections.parcel_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParcelBox> list = new ArrayList<ParcelBox>();

        list.add(new ParcelBox("Alice", "John", 10, 5, 100, "Chennai", "A1"));
        list.add(new ParcelBox("Bob", "John", 5, 3, 50, "Delhi", "B2"));
        list.add(new ParcelBox("Carol", "Sam", 8, 4, 80, "Mumbai", "C3"));

        NewPostOfficeManage obj = new NewPostOfficeManageImpl(list);

        System.out.println("=== By Weight Desc ===");
        System.out.println(obj.getDescSortedBoxesByWeight());

        System.out.println("=== By Cost Asc ===");
        System.out.println(obj.getAscSortedBoxesByCost());

        System.out.println("=== By Recipient (John) ===");
        System.out.println(obj.getBoxesByRecipient("John"));

        System.out.println("=== Get By ID (2) ===");
        System.out.println(obj.getBoxById(2));
    }
}
