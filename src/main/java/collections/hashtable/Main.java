package collections.hashtable;

public class Main {
    public static void main(String[] args) {
        HashtableOpen8to16Impl ht = HashTableOpen8To16.getInstance();

        ht.insert(1, "A");
        ht.insert(2, "B");
        ht.insert(3, "C");

        System.out.println("Search 2: " + ht.search(2));

        ht.remove(2);

        System.out.println("Search 2 after remove: " + ht.search(2));

        int[] keys = ht.keys();

        System.out.print("Keys: ");
        for (int k : keys) {
            System.out.print(k + " ");
        }

        System.out.println("\nSize: " + ht.size());
    }

}
