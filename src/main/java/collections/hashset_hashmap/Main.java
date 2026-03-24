package collections.hashset_hashmap;

public class Main {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addFriend("Alice", "Bob");
        sn.addFriend("Bob", "Charlie");

        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
        sn.displayFriends("Charlie");


        System.out.println("Mutual between Alice & Charlie: "
                + sn.mutualFriends("Alice", "Charlie"));

        sn.printFriendCount();

        sn.removeFriend("Alice", "Bob");

        System.out.println("\nAfter removing Alice & Bob:");
        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
    }

}
