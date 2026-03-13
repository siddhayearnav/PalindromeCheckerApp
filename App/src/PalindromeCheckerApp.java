import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MAIN CLASS: UseCase7PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * Characters are inserted into the deque and then compared by removing
 * elements from both ends using:
 *    - removeFirst()
 *    - removeLast()
 *
 * This avoids reversing the string and provides an efficient
 * front-to-back comparison approach.
 *
 * @author Arnav Siddhaye
 * @version 7.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {


        String input = "refer";
        System.out.println("Input: " + input);


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}