import javax.swing.*;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        // 8 + 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("who are you?");
        String name = scanner.nextLine();
        byte age = 30;
        if (name.equals("faisal")) {
            System.out.println("I know you " + name + ", you're " + age + " years old");
            System.out.println("You don't have any favorite quote");
        } else {
            System.out.println("I don't know you");
        }
        System.out.println("Now give me 2 integers and 1 double numbers, i'll do substraction then multiplication");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double doubleNum = scanner.nextDouble();
        double result = (num1 - num2) * doubleNum;
        String status = (result >= 0) ? "positive" : "negative";
        System.out.println("Easy, it's " + result + ", a " + status + " number");

        // 9

        JFrame frame = new JFrame();
        String[] columnNames = {"Name", "Age"};

        Object[][] data = {
                {"Ken", new Integer(5)},
                {"Tom", new Integer(3)},
                {"Susan", new Integer(2)},
                {"Mark", new Integer(20)},
                {"Joe", new Integer(10)}
        };
        JTable table = new JTable(data, columnNames);


        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
