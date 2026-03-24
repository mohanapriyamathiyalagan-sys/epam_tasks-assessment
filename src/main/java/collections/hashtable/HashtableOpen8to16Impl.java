package collections.hashtable;

public class HashtableOpen8to16Impl implements HashTableOpen8To16{
    private static class Entry {
        int key;
        Object value;
        boolean deleted;

        Entry(int key, Object value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }

    private Entry[] table;
    private int capacity;
    private int size;

    public HashtableOpen8to16Impl() {
        capacity = 8;
        table = new Entry[capacity];
        size = 0;
    }

    private int hash(int key) {
        if (key < 0) key = -key;
        return key % capacity;
    }

    public void insert(int key, Object value) {

        if (size == capacity) {
            if (capacity == 16) {
                throw new IllegalStateException("Max capacity reached");
            }
            resize(capacity * 2);
        }

        int index = hash(key);

        while (table[index] != null && !table[index].deleted) {
            if (table[index].key == key) {
                table[index].value = value; // replace
                return;
            }
            index = (index + 1) % capacity;
        }

        table[index] = new Entry(key, value);
        size++;
    }

    public Object search(int key) {

        int index = hash(key);
        int start = index;

        while (table[index] != null) {

            if (!table[index].deleted && table[index].key == key) {
                return table[index].value;
            }

            index = (index + 1) % capacity;

            if (index == start) break;
        }

        return null;
    }

    public void remove(int key) {

        int index = hash(key);
        int start = index;

        while (table[index] != null) {

            if (!table[index].deleted && table[index].key == key) {
                table[index].deleted = true;
                size--;
                break;
            }

            index = (index + 1) % capacity;

            if (index == start) return;
        }

        if (size > 0 && size <= capacity / 4 && capacity > 2) {
            resize(capacity / 2);
        }
    }

    public int size() {
        return size;
    }

    public int[] keys() {

        int[] result = new int[size];
        int i = 0;

        for (int j = 0; j < capacity; j++) {
            if (table[j] != null && !table[j].deleted) {
                result[i++] = table[j].key;
            }
        }

        return result;
    }

    private void resize(int newCapacity) {

        Entry[] oldTable = table;

        table = new Entry[newCapacity];
        capacity = newCapacity;
        size = 0;

        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null && !oldTable[i].deleted) {
                insert(oldTable[i].key, oldTable[i].value);
            }
        }
    }
}
