package practice1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double number1 = (46 + 10) * (10 / 3);

        int number2 = (29) * (4) * (-15);

        int number = 10500;
        double result =  ((double)number / 10) / 10;

        System.out.println(result);

        double result1 = 3.6 * 4.1 * 5.9;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int b = scanner.nextInt();
            System.out.println(b);
        }
        //for (int i = 0; i < 3; i++) {
        //   int b = scanner.nextInt();
        //   System.out.println(b);
        // }


        int b = 5;

        if (b % 2 == 0 && b > 100 && b != 0) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 != 0 && b != 0) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b != 0) {
            System.out.println("Четное");
        }
    }
}
