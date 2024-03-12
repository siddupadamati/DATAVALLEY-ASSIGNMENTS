public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);
        int indexToReplace = 7;
        char replacementChar = '*';

        if (indexToReplace >= 0 && indexToReplace < originalString.length()) {
            char[] charArray = originalString.toCharArray();

            charArray[indexToReplace] = replacementChar;

            String modifiedString = new String(charArray);

            System.out.println("String after replacement: " + modifiedString);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
