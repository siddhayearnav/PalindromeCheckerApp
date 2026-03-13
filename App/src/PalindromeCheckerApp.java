import java.util.Stack;

/**
 * MAIN CLASS: UseCase5PalindromeCheckerApp
 *
 * Use Case 5: Stack Based Validation
 *
 * Description:
 * This class validates a palindrome using Stack.
 *
 * At this stage, the application:
 * - Pushes characters into stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This stack uses reverse logic (LIFO).
 *
 * @author Arnav Siddhaye
 * @version 5.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "noon";


        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        boolean isPalindrome = true;


        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?:");
        System.out.println(isPalindrome);
    }
}