import java.util.Scanner;

public class Whisperwind {
    public static void main(String[] args) {
        String chatName = "Whisperwind";
        System.out.println("Hello! I'm " + chatName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What can I do for you? (type all in small letter)" );
        System.out.print("> ");
        String Echo = scanner.nextLine();

        while (!Echo.equals("bye")) {
            System.out.println(Echo);
            System.out.print("> ");
            Echo = scanner.nextLine();
        }

        System.out.println("Bye. Hope to see you again soon!");

        scanner.close();

    }
}
