import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC10
     */




    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // 1. Normalization: Remove non-alphanumeric characters and lowercase everything
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Palindrome Logic (based on your hint)
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}