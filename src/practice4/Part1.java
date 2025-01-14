package practice4;

import java.util.Scanner;

public class Part1 {

    public static void summ() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

    }

    public static void two() {
        for (
                int i = 1;
                i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else if (i % 5 == 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }


    public static boolean ret;

    public static boolean print1() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int sum = number1 + number2;
        if (sum == number3) ret = true;
        return ret;
    }


    public static boolean ret1;

    public static boolean print2() {
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        int numberTwo = scanner1.nextInt();
        int numberThree = scanner1.nextInt();
        if (numberTwo > number && numberThree > numberTwo) ret1 = true;
        return ret1;

    }

    int[] array = new int[]{1, 2, 3, 4, 5, 6};

    public static boolean firstLast3(int[] array) {
        return array[0] == 3 || array[array.length - 1] == 3;
    }

    public static boolean x;
    int[] array1 = new int[]{1, 2, 3, 4, 5, 6};

    public static boolean arrThree(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1 || array1[i] == 3) {
                x = true;
            }
        }
        return x;
    }

    public static void main(String[] args) {


        Part1.summ();
        Part1.two();
        Part1.print1();
        Part1.print2();
        int[] arr = new int[]{1, 22, 22, 3, 44, 5};
        Part1.firstLast3(arr);
        Part1.arrThree(arr);


    }


}



