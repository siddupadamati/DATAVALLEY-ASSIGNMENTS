public class Main {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }

    public static void printOddPositionCharacters(String text) {
        
        String trimmedText = text.replaceAll("\\s", "");
        
        for (int i = 0; i < trimmedText.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(trimmedText.charAt(i) + " ");
            }
 }
}
}