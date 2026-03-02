import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean isPalindrome = checker.checkPalindrome(input);

        System.out.println("Is it a palindrome: " + (isPalindrome ? "True" : "False"));

        scanner.close();
    }
}