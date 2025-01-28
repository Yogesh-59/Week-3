package SinglyLinkedList.InventoryManagementSystem;

class InventoryItem {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryItem next;
    //Constructor For inventory item class
    public InventoryItem(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
