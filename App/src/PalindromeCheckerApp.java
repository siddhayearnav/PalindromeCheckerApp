/**
 * MAIN CLASS: UseCase11PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates object-oriented design.
 * The palindrome logic is encapsulated inside
 * a separate service class.
 *
 * This proves:
 *  - Reusability
 *  - Encapsulation
 *  - Clean architecture design
 *
 * @author Arnav Siddhaye
 * @version 11.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "racecar";
        System.out.println("Input: " + input);
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);
    }
}
class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }


        int start = 0;
        int end = input.length() - 1;


        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}