package SinglyLinkedList.SocialMediaFriendConnections;

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Yogesh", 20);
        sm.addUser(2, "Deepraj", 21);
        sm.addUser(3, "Durgesh", 35);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);

        System.out.println("Aryan's friends: " + sm.displayAllFriends(1));
        System.out.println("Deepraj's friends: " + sm.displayAllFriends(2));
        System.out.println("Durgesh's friends: " + sm.displayAllFriends(3));

        System.out.println("Mutual friends between Aryan and Deepraj: " + sm.findMutualFriends(1, 2));

        sm.removeFriendConnection(1, 2);
        System.out.println("Alice's friends after removing Deepraj: " + sm.displayAllFriends(1));

        System.out.println("Number of friends Aryan has: " + sm.countFriends(1));
        System.out.println("Search for user by ID 2: " + sm.searchUserById(2).name);
        System.out.println("Search for user by name 'Durgesh': " + sm.searchUserByName("Durgesh").userId);
    }
}
