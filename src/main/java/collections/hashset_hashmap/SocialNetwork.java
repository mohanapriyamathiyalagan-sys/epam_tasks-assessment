package collections.hashset_hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SocialNetwork {
    private HashMap<String, HashSet<String>> network = new HashMap<>();

    private void addUser(String user) {
        if (!network.containsKey(user)) {
            network.put(user, new HashSet<>());
        }
    }

    public void addFriend(String user1, String user2) {
        if (user1 == null || user2 == null) throw new NullPointerException();

        addUser(user1);
        addUser(user2);

        network.get(user1).add(user2);
        network.get(user2).add(user1);
    }

    public void removeFriend(String user1, String user2) {
        if (network.containsKey(user1)) {
            network.get(user1).remove(user2);
        }
        if (network.containsKey(user2)) {
            network.get(user2).remove(user1);
        }
    }

    public void displayFriends(String user) {
        if (!network.containsKey(user)) {
            System.out.println(user + " not found");
            return;
        }

        System.out.println(user + "'s friends: " + network.get(user));
    }

    public Set<String> mutualFriends(String user1, String user2) {
        HashSet<String> result = new HashSet<>();

        if (!network.containsKey(user1) || !network.containsKey(user2)) {
            return result;
        }

        for (String f : network.get(user1)) {
            if (network.get(user2).contains(f)) {
                result.add(f);
            }
        }

        return result;
    }

    public void printFriendCount() {
        for (String user : network.keySet()) {
            System.out.println(user + " has " + network.get(user).size() + " friends");
        }
    }
}
