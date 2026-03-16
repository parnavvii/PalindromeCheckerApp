import java.util.*;

public class PalindromeCheckerApp {

    // Inner class for encapsulation
    static class PalindromeChecker {

        public boolean checkPalindrome(String input) {
            input = input.replaceAll("\\s+", "").toLowerCase();
            return check(input, 0, input.length() - 1);
        }

        private boolean check(String s, int start, int end) {

            if (start >= end) {
                return true;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            return check(s, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}