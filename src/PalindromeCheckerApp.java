import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start, end;

        start = System.nanoTime();
        boolean reverseResult = reverseMethod(input);
        end = System.nanoTime();
        long reverseTime = end - start;

        start = System.nanoTime();
        boolean stackResult = stackMethod(input);
        end = System.nanoTime();
        long stackTime = end - start;

        start = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Reverse Method : " + (reverseResult ? "True" : "False"));
        System.out.println("Stack Method   : " + (stackResult ? "True" : "False"));
        System.out.println("Deque Method   : " + (dequeResult ? "True" : "False"));

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Reverse Method : " + reverseTime);
        System.out.println("Stack Method   : " + stackTime);
        System.out.println("Deque Method   : " + dequeTime);

        scanner.close();
    }

    static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    static boolean stackMethod(String input) {
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

    static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}