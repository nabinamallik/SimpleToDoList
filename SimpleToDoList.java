import java.util.ArrayList;
import java.util.Scanner;

public class SimpleToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        boolean again = false;
        int ch;
        do {
            System.out.println("Select an option:\n1. Add Item\n2. Remove Item\n3. View to-do List\n4. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    scanner.nextLine(); 
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the list.\nYour updated to-list is :");
                    System.out.println("To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ". " + toDoList.get(i));
                    }
                    System.out.println("\nDo you want to make any changes...(1. Yes / 2. No)");
                    ch = scanner.nextInt();
                    if(ch == 1){
                    	again = true;
                    	}
                    else{
                    	System.exit(0);
                    	}
                    break;
                case 2:
                    System.out.print("Enter the index of the item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                        String removedItem = toDoList.remove(indexToRemove);
                        System.out.println(removedItem + " removed from the list.\nYour updated to-do list is:");
                        System.out.println("To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ". " + toDoList.get(i));
                    }
                    System.out.println("\nDo you want to make any changes...(1. Yes / 2. No)");
                    ch = scanner.nextInt();
                    if(ch == 1){
                    	again = true;
                    	}
                    else{
                    	System.exit(0);
                    	}
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ". " + toDoList.get(i));
                    }
                    System.out.println("\nDo you want to make any changes...(1. Yes / 2. No)");
                    ch = scanner.nextInt();
                    if(ch == 1){
                    	again = true;
                    	}
                    else{
                    	System.exit(0);
                    	}
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        }
        while(again);
    }
}
