import java.util.LinkedList;

/**
 * MAIN CLASS: UseCase8PalindromeCheckerApp
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *    - removeFirst()
 *    - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Arnav Siddhaye
 * @version 8.0
 */

public class PalindromeCheckerApp{

    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input: " + input);


        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;


        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}