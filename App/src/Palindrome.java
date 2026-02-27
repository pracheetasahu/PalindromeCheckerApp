


public class Palindrome {

            public static void main(String[] args) {

                // Original string
                String word = "racecar";

                // Reverse the string using loop
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);  // String concatenation
                }

                // Compare original and reversed
                if (word.equals(reversed)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is NOT a palindrome.");
                }
            }
        }


