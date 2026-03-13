/**
 * MAIN CLASS: UseCase9PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 *  - All characters are matched (base condition met), or
 *  - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Arnav Siddhaye
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command Line arguments
     */
    public static void main(String[] args) {


        String input = "madan";

        System.out.println("Input: " + input);

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {


        if (start >= end) {
            return true;
        }


        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }


        return check(s, start + 1, end - 1);
    }
}