import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String text) {

        // Normalize text: remove non-letters and convert to lowercase
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(text).reverse().toString();

        // Compare original and reversed
        return text.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome ✅");
        } else {
            System.out.println("It is NOT a palindrome ❌");
        }

        scanner.close();
    }
}