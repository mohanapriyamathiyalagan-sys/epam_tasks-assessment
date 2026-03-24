package collections.doublyLinkedList;

import java.util.Optional;

public class DoublyListImpl implements DoublyLinkedList {

    private Node head;
    private Node tail;

    private static class Node {
        Object data;
        Node prev;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }
    public boolean addFirst(Object element) {
        if (element == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node(element);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        return true;
    }
    public boolean addLast(Object element) {
        if (element == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node(element);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        return true;
    }

    private Node getNode(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current;
            }
            current = current.next;
            i++;
        }

        throw new IndexOutOfBoundsException();
    }

    public boolean delete(int index) {
        Node node = getNode(index);

        if (node.prev == null) { // head
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            node.prev.next = node.next;
        }

        if (node.next == null) { // tail
            tail = node.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            node.next.prev = node.prev;
        }

        return true;
    }

    public Optional<Object> remove(Object element) {
        if (element == null) {
            throw new NullPointerException();
        }

        Node current = head;

        while (current != null) {
            if (current.data.equals(element)) {

                if (current.prev == null) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                }

                if (current.next == null) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.next.prev = current.prev;
                }

                return Optional.of(current.data);
            }
            current = current.next;
        }

        return Optional.empty();
    }

    public boolean set(int index, Object element) {
        if (element == null) {
            throw new NullPointerException();
        }

        Node node = getNode(index);
        node.data = element;

        return true;
    }

    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public Object[] toArray() {
        int size = size();
        Object[] arr = new Object[size];

        Node current = head;
        int i = 0;

        while (current != null) {
            arr[i++] = current.data;
            current = current.next;
        }

        return arr;
    }

    public String toString() {
        String result = "";
        Node current = head;

        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += " ";
            }
            current = current.next;
        }

        return result;
    }
}