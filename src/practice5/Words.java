package practice5;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    private static String longestWord(String text) {
        String[] word = text.split(" ");
        Arrays.sort(word);
        int x = 0;
        String longest = " ";
        for (String i : word) {
            if (i.length() > x) {
                x = i.length();
                longest = i;
            }
        }
        System.out.println(longest);
        return longest;
    }

    public static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase((new StringBuilder(s)).reverse().toString());

    }

    public static void replaceText(String text, String word1, String word2) {
      //  Scanner scanner = new Scanner(System.in);
       // String t1 = scanner.nextLine();
       // String t2 = scanner.nextLine();
        text = text.replaceAll(word1, word2);
        System.out.println(text);
    }

    public static int count(String text1, String text2) {
        return (text1.length() - text1.replace(text2, "").length()) / text2.length();

    }

    public static String reversWords(String words) {
        String rever = String.valueOf(new StringBuilder(words).reverse());
        String result = "";
        for (String x : rever.split(" ")) {
            result = String.format("%s%s%s", x, " ", result);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Words.reversWords("CAT DOG"));
        Words.longestWord("fewfeowj wefewf efew few ewfew e");
        System.out.println(Words.isPalindrome("Топот"));
        Words.replaceText("бяка бяка бяка бака", "бяка", "лобстер");


        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String word1 = scanner.next();
        int count1 = count(word, word1);
        System.out.println(count1);

        scanner.close();
    }
}
