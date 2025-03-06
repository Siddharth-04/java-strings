import java.util.Scanner;

public class PalindromeChecker{
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Palindrome (Iterative): " + isPalindromeIterative(text));
        System.out.println("Palindrome (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Palindrome (Array-based): " + isPalindromeArray(text));
    }
}
/*
    Enter a string: racecar
    Palindrome (Iterative): true
    Palindrome (Recursive): true
    Palindrome (Array-based): true

*/