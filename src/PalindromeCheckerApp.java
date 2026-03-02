import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Is it a palindrome: " + (isPalindrome ? "True" : "False"));

        scanner.close();
    }

    static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return checkPalindrome(str, start + 1, end - 1);
    }
}