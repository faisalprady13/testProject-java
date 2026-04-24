import java.util.Scanner;

public class IfElseExcersise {

    static void main() {
        Scanner scanner = new Scanner(System.in);
//         medium 1
        System.out.println("whats your score?");
        int score = scanner.nextInt();
        System.out.println("do you have a ticket?");
        boolean hasTicket = scanner.nextBoolean();
        if (score >= 50 && hasTicket) {
            System.out.println("Access granted, Welcome!");
        } else {
            System.out.println("Access denied.");
        }


        // medium 2
        System.out.println("Give me a temperature number");
        int temperature = scanner.nextInt();

        if (temperature >= 30) {
            System.out.println("hot");
        } else if (temperature >= 20) {
            System.out.println("warm");
        } else if (temperature >= 10) {
            System.out.println("cool");
        } else {
            System.out.println("cold");
        }

        // medium 3
        System.out.println("Give me random number");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "even" : "odd");


        // bonus 1
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            System.out.println("invalid name");
        } else {
            System.out.printf("hallo %s", name);
        }

        // bonus 2
    }
}
