import java.util.Scanner;

//Create class PalindromeCheck to check for palindromes
public class PalindromeCheck {

    // Logic 1: Iterative
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

    // Logic 2: Recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse and compare
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        return reverse;
    }

    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome (Iterative): " + isPalindromeIterative(text));
        System.out.println("Palindrome (Recursive): " +
                isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Palindrome (Array): " + isPalindromeArray(text));
    }
}
