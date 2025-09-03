import java.util.Scanner;

public class Whisperwind {
    public static void main(String[] args) {
        String chatName = "Whisperwind";
        System.out.println("Hello! I'm " + chatName);
        String[] list = new String[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("What can I do for you?");
        System.out.println("Type 'list' to see your history or 'bye' to exit.");

        String input;
        int i = 0;
        boolean isExit = false;

        while (!isExit && i < list.length) {
            System.out.print("> ");
            input = scanner.nextLine();

            // list condition
            if (input.equals("list")) {
                System.out.println("--- Your history ---");
                if (i == 0) {
                    System.out.println("Your list is empty.");
                } else {
                    // Print all items added so far
                    for (int j = 0; j < i; j++) {
                        System.out.println((j + 1) + ". " + list[j]);
                    }
                }
                System.out.println("-------------------");
                continue; // Skip the below statement, and go back to beginning to ask user insert next input
            }

            // exit condition
            if (input.equals("bye")) {
                isExit = true; // break to exit while loop
                System.out.println("Goodbye detected. Exiting...");

                continue; // Skip the rest of the loop
            }

            // If it's not "list" or "bye", print the input that it is being added and add the input to the array
            System.out.println("added: " + input);
            list[i] = input;
            i++; // only added when successfully added tpo the list. bye and list condition have continoue statement that will not reach this line
        }

        // to inform that memory is full to user, hence, unable to input more
        if (i >= list.length) {
            System.out.println("My memory is full!");
            System.out.println("Bye. Hope to see you again soon!");
        }

        // Print the goodbye message
        System.out.println("Bye. Hope to see you again soon!");
        scanner.close();
    }
}