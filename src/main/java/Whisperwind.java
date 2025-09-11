import java.util.Scanner;

public class Whisperwind {
    public static void main(String[] args) {
        String name = "Whisperwind";
        System.out.println("Hello! I'm " + name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What can I do for you?");
        System.out.println("Type 'bye' to exit");
        System.out.println("> ");
        String Echo = scanner.nextLine();

        while (!Echo.equalsIgnoreCase("bye")){
            System.out.println(Echo);
            System.out.println("> ");
            Echo = scanner.nextLine();
        }

        System.out.println("Bye. Hope to see you again soon!");

        scanner.close();
    }
}
