package collections.hashtable;

public interface HashTableOpen8To16 {
    void insert(int key, Object value);

    Object search(int key);

    void remove(int key);

    int size();

    int[] keys();

    static HashtableOpen8to16Impl getInstance() {
        return new HashtableOpen8to16Impl();
    }
}
