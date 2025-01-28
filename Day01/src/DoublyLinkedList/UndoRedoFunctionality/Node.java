package DoublyLinkedList.UndoRedoFunctionality;

 class Node {
     String text; // Text content of the state
     Node prev; // Pointer to the previous state
     Node next; // Pointer to the next state

     Node(String text) {
         this.text = text;
     }
}
