import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC12
     */




    public static void main(String[] args) {
        String input = "level";

        // Use the Stack-based strategy
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Interface for Palindrome Validation Strategies.
 */
interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            // If the current character doesn't match the popped character, it's not a palindrome
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}