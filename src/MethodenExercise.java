public class MethodenExercise {

    static void main() {

        printHello();
        System.out.println(calculateArea(3, 4));
        System.out.println(divide(1, 0));
    }

    static void printHello() {
        System.out.println("Hello world");
    }

    // medium 1
    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
