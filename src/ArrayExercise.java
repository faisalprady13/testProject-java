import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercise {
    static void main() {
//        easy1();
//        easy2();
//        easy3();
//        medium1();
//        medium2();
//        medium3();
//        medium4();
//        bonus1();
//        bonus2();
//        bonus3();
//        bonus4();
        bonus5();
    }

    static void easy1() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    static void easy2() {
        String[] names = {"john", "josh", "jane", "jack"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void easy3() {
        int[] numbers = {2, 4, 6, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * numbers[i]);
        }
    }

    static void medium1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        // for each loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    static void medium2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.printf("%d is sum of %s", sum, Arrays.toString(numbers));
    }


    static void medium3() {
        String[] cities = {"Berlin", "Hamburg", "Frankfurt"};
        // for loop
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("on index %d is %s\n", i, cities[i]);
        }
    }


    static void medium4() {
        int[] numbers = {34, 4, 5, 66, 7, 8, 9, 10};
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.printf("smallest number is %d\n", smallest);
        System.out.printf("largest number is %d ", largest);
    }


    static void bonus1() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            int doubleValue = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(numbers));
    }

    static void bonus2() {
        String[] firstNames = {"jack", "john", "james"};
        String[] lastNames = {"sparrow", "doe", "bond"};
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s %s\n", firstNames[i], lastNames[i]);
        }
    }


    static void bonus3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me 5 numbers");

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        System.out.println(Arrays.toString((numbers)));
        scanner.close();
    }


    static void bonus4() {
        int[] scores = {85, 70, 95, 60};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        System.out.printf("%d is the average of %s", sum / scores.length, Arrays.toString(scores));
    }


    static void bonus5() {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
