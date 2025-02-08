import java.util.*;
import java.lang.*;
import java.io.*;

class checkPalindrome
{
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println("Arguments passed: " + Arrays.toString(args));

        if (args.length == 0) {
            System.out.println("No input provided. Please pass a string as an argument.");
            return;
        }

        String input = args[0];
        boolean output = isPalindrome(input);
        System.out.println("Is palindrome? " + output);

    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
}