package practice4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    static int a = 1;
    int[] array = new int[10];

    public static void meth(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                a++;

            }
        }
        if (a == array.length) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }


    public static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result:  " + Arrays.toString(array));
    }

    // int[] array1 = new int[5];

    public static void swap(int[] array1) {
        int i = array1[array1.length - 1];
        array1[array1.length - 1] = array1[0];
        array1[0] = i;
        for (int j = 0; j < array1.length; j++) {
            System.out.println(array1[j]);
        }
    }



    public static void unic(int[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;

                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            System.out.println("Нет уникальных");
        } else {
            System.out.printf("Первый уникальный %d", array[result]);
        }
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        Part2.meth(arr1);
        Part2.test();
        int[] arr = new int[]{1, 1, 3, 4, 5, 6};
        Part2.swap(arr);
        Part2.unic(arr);

    }
}
