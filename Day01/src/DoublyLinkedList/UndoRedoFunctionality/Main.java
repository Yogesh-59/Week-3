package DoublyLinkedList.UndoRedoFunctionality;

public class Main {
    public static void main(String[] args)
    {
        // Create a new text editor
        TextEditor editor = new TextEditor();
        // Add some text states
        editor.addTextState("Deepraj");
        editor.addTextState("Yogesh 2");
        editor.addTextState("Rishi 3");
        // Print the current state
        System.out.println("Current State: " + editor.getCurrentState()); // Aryan 3
        // Undo the last action
        editor.undo();
        // Print the current state after undo
        System.out.println("Current State after undo: " + editor.getCurrentState()); // Aryan 2
        // Redo the last undone action
        editor.redo();
        // Print the current state after redo
        System.out.println("Current State after redo: " + editor.getCurrentState()); // Aryan 3
    }
}
