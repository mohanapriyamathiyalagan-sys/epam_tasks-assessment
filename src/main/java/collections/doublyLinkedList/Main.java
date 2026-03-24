package collections.doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyListImpl();

        list.addFirst("B");
        list.addFirst("A");
        list.addLast("C");
        list.addLast("D");

        System.out.println(list);

        list.delete(1);
        System.out.println(list);
        list.remove("C");
        System.out.println(list);

        list.set(1, "Z");
        System.out.println(list);
        System.out.println("Size: " + list.size());

        Object[] arr = list.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
