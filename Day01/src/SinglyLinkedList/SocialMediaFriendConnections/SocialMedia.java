package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.*;
class SocialMedia {
    private List<User> users;

    SocialMedia() {
        users = new ArrayList<>();
    }

    public void addUser(int userId, String name, int age) {
        users.add(new User(userId, name, age));
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    public List<Integer> findMutualFriends(int userId1, int userId2) {
        List<Integer> mutualFriends = new ArrayList<>();
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            List<Integer> friends1 = user1.friendIds;
            List<Integer> friends2 = user2.friendIds;
            for (int friendId : friends1) {
                if (friends2.contains(friendId)) {
                    mutualFriends.add(friendId);
                }
            }
        }
        return mutualFriends;
    }

    public List<Integer> displayAllFriends(int userId) {
        User user = getUserById(userId);
        if (user != null) {
            return user.friendIds;
        }
        return new ArrayList<>();
    }

    public User searchUserById(int userId) {
        for (User user : users) {
            if (user.userId == userId) {
                return user;
            }
        }
        return null;
    }

    public User searchUserByName(String name) {
        for (User user : users) {
            if (user.name.equals(name)) {
                return user;
            }
        }
        return null;
    }

    public int countFriends(int userId) {
        User user = getUserById(userId);
        if (user != null) {
            return user.friendIds.size();
        }
        return 0;
    }

    private User getUserById(int userId) {
        for (User user : users) {
            if (user.userId == userId) {
                return user;
            }
        }
        return null;
    }
}
