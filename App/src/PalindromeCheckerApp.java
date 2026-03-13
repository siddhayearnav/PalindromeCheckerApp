import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC13
     */


    public static void main(String[] args) {
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the palindrome check
        boolean isPalindrome = strategy.check(input);

        // Capture end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}