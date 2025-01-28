package SinglyLinkedList.InventoryManagementSystem;

public class Main {
    public static void main(String[]args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        inventory.addItemAtEnd("Track-shoot", 1, 7, 7000);
        inventory.addItemAtEnd("Coat", 2, 16, 56300);

        System.out.println("Total value of inventory: " + inventory.calculateTotalValue());

        inventory.sortInventoryByName(true);
        System.out.println("Sorted inventory by name in ascending order:");
        InventoryItem current = inventory.head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }

        inventory.sortInventoryByPrice(false);
        System.out.println("Sorted inventory by price in descending order:");
        current = inventory.head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
