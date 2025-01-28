package SinglyLinkedList.InventoryManagementSystem;

 class InventoryLinkedList {
     public InventoryItem head;

     public InventoryLinkedList() {
         this.head = null;
     }

     public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
         InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
         newItem.next = head;
         head = newItem;
     }

     public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
         InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
         if (head == null) {
             head = newItem;
         } else {
             InventoryItem current = head;
             while (current.next != null) {
                 current = current.next;
             }
             current.next = newItem;
         }
     }

     public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
         InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
         if (position == 0) {
             newItem.next = head;
             head = newItem;
         } else {
             InventoryItem current = head;
             for (int i = 0; i < position - 1 && current != null; i++) {
                 current = current.next;
             }
             if (current != null) {
                 newItem.next = current.next;
                 current.next = newItem;
             }
         }
     }

     public void removeItemById(int itemId) {
         if (head == null) return;
         if (head.itemId == itemId) {
             head = head.next;
             return;
         }
         InventoryItem current = head;
         while (current.next != null && current.next.itemId != itemId) {
             current = current.next;
         }
         if (current.next != null) {
             current.next = current.next.next;
         }
     }

     public void updateQuantityById(int itemId, int newQuantity) {
         InventoryItem current = head;
         while (current != null) {
             if (current.itemId == itemId) {
                 current.quantity = newQuantity;
                 return;
             }
             current = current.next;
         }
     }

     public InventoryItem searchById(int itemId) {
         InventoryItem current = head;
         while (current != null) {
             if (current.itemId == itemId) {
                 return current;
             }
             current = current.next;
         }
         return null;
     }

     public InventoryItem searchByName(String itemName) {
         InventoryItem current = head;
         while (current != null) {
             if (current.itemName.equals(itemName)) {
                 return current;
             }
             current = current.next;
         }
         return null;
     }

     public double calculateTotalValue() {
         double totalValue = 0;
         InventoryItem current = head;
         while (current != null) {
             totalValue += current.price * current.quantity;
             current = current.next;
         }
         return totalValue;
     }

     public void sortInventoryByName(boolean ascending) {
         head = mergeSort(head, (a, b) -> ascending ? a.itemName.compareTo(b.itemName) : b.itemName.compareTo(a.itemName));
     }

     public void sortInventoryByPrice(boolean ascending) {
         head = mergeSort(head, (a, b) -> ascending ? Double.compare(a.price, b.price) : Double.compare(b.price, a.price));
     }

     private InventoryItem mergeSort(InventoryItem head, java.util.Comparator<InventoryItem> comparator) {
         if (head == null || head.next == null) {
             return head;
         }
         InventoryItem middle = getMiddle(head);
         InventoryItem nextOfMiddle = middle.next;
         middle.next = null;
         InventoryItem left = mergeSort(head, comparator);
         InventoryItem right = mergeSort(nextOfMiddle, comparator);
         return sortedMerge(left, right, comparator);
     }

     private InventoryItem getMiddle(InventoryItem head) {
         if (head == null) {
             return head;
         }
         InventoryItem slow = head, fast = head.next;
         while (fast != null) {
             fast = fast.next;
             if (fast != null) {
                 slow = slow.next;
                 fast = fast.next;
             }
         }
         return slow;
     }

     private InventoryItem sortedMerge(InventoryItem a, InventoryItem b, java.util.Comparator<InventoryItem> comparator) {
         if (a == null) return b;
         if (b == null) return a;
         InventoryItem result;
         if (comparator.compare(a, b) <= 0) {
             result = a;
             result.next = sortedMerge(a.next, b, comparator);
         } else {
             result = b;
             result.next = sortedMerge(a, b.next, comparator);
         }
         return result;
     }
 }
