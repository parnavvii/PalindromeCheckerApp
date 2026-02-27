/*
Application entry point.

This is the first method executed by the JVM
when the program starts.

@author Developer
@Version 1.0
 */


public class PalindromeCheckerApp {
    public static void main(String [] args){
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }
}