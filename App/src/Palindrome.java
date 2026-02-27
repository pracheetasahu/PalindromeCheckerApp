public class Palindrome {
    static void main() {
        System.out.println("welcome to polindrome checkerApp");
        System.out.println("version 1.0");
        System.out.println("system initialised");


        public class UseCase2PalindromeCheckerApp {

            public static void main(String[] args) {

                // Hardcoded string to check
                String word = "madam";

                // Reverse the string manually
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                if (word.equals(reversed)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is NOT a palindrome.");
                }
            }
        }
    }
}
