import java.util.Scanner;

//Create class UniqueCharacters
public class UniqueCharacters {

    // Method to find length of text WITHOUT using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);

        // Array to store unique characters (max possible size = length)
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to compare with previous characters
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create new array of exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.print("Unique characters are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
