import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting
        int vowelCount = 0;
        int consonantCount = 0;
  for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (isVowel(currentChar)) {
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                consonantCount++;
            }
        }

          System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }

       private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}