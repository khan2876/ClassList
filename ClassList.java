import java.util.ArrayList;
import java.util.Scanner;

public class ClassList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = "";
         
        // TODO: initialize classList
        
        
        System.out.println("Q to Quit, A to Add a name, R to remove, I to insert\n");

        while( !input.equals("Q") ) {
            System.out.print("Enter your selection: ");
            input = keyboard.next();

            if(input.equals("A")) {
                // TODO: Add a name to the end of the list.
                System.out.print("Enter a name to add: ");
                
            } else if(input.equals("R")) {
                // TODO: Remove an item from the list.  
                // Ask for the index of the item to be removed.  Use nextInt()

            } else if(input.equals("I")) {
                // TODO: Insert an item into the list at a specific location.
                // Ask for the location to add to, and the name to be added.
                
            } else  {
                System.out.println("Invalid Selection.");
            }
            printList(/* TODO: insert appropriate arguments here (the list) */);
        }
    }

    public static void printList(/* TODO: insert appropriate arguments here */) {
        // TODO: print the list along with the index numbers

    }
}
