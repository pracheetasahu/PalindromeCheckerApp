import java.util.*;

public class Palindrome {

    // Method 1: Two Pointer
    public static boolean twoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Stack
    public static boolean stackMethod(String input) {

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

    // Method 3: Deque
    public static boolean dequeMethod(String input) {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long startTime, endTime;

        // Two Pointer Timing
        startTime = System.nanoTime();
        boolean result1 = twoPointer(input);
        endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean result2 = stackMethod(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Deque Timing
        startTime = System.nanoTime();
        boolean result3 = dequeMethod(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method Result: " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}