import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = stringScanner.next();

        if (word.length() == 1) {
            char letter = word.charAt(0);

            switch (letter) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        } else {
            System.out.println("Please enter a single letter.");
        }
    }
}
