/*
Application entry point.

This is the first method executed by the JVM
when the program starts.

@author Developer
@Version 1.0
 */



import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String [] args){
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end)
        {
            if (chars[start] != chars[end])
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input: " + input);
        System.out.println("Is it Palindrome? " + isPalindrome);
    }
}