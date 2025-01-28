package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.*;
 class User {
     int userId;
     String name;
     int age;
     List<Integer> friendIds;

     User(int userId, String name, int age) {
         this.userId = userId;
         this.name = name;
         this.age = age;
         this.friendIds = new ArrayList<>();
     }
}
