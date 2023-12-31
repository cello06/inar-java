package week_10.live_class.test;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        System.out.println("Ignoring nonalphanumeric characters,\n" +
                "is " + s + " a palindrome ? ---> " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String filtered = filter(s);
        String reversed = reverse(filtered);

        return filtered.equalsIgnoreCase(reversed);
    }

    public static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
}
