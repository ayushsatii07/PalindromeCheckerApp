public class PalindromeCheckerApp {

    public static void main(String [] args){
        System.out.println("===========================================");
        System.out.println("     Palindrome Checker App - UC2         ");
        System.out.println("===========================================\n");

        // Hardcoded string
        String input = "madam";

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Check palindrome
        boolean isPalindrome = input.equals(reversed);

        // Print result in required format
        System.out.println("String: " + input);
        System.out.println("Is it a palindrome: " + (isPalindrome ? "True" : "False"));
    }
}