import java.util.Scanner;

public class Whisperwind {
    public static void main(String[] args) {
        String name = "Whisperwind";
        System.out.println("Hello! I'm " + name);
        String[] list = new String[100];
        Scanner scanner = new Scanner(System.in);

        System.out.println("What can I do for you?");
        System.out.println("Type 'list' to see your book list");
        System.out.println("Type 'bye' to exit");

        String input;
        int i = 0;
        boolean isExit = false;

        while (!isExit) {
            System.out.print("> ");
            input = scanner.nextLine().trim();

            // list condition
            if (input.equalsIgnoreCase("list")) {
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
                continue;
            }

            // exit condition
            if (input.equalsIgnoreCase("bye")) {
                isExit = true;
                System.out.println("Goodbye detected. Exiting...");
                continue;
            }

            // Check if memory is full
            if (i >= list.length) {
                System.out.println("My memory is full!");
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }

            // If it's not "list" or "bye", add the input to the array
            System.out.println("added: " + input);
            list[i] = input;
            i++;
        }

        System.out.println("Bye. Hope to see you again soon!");
        scanner.close();
    }
}