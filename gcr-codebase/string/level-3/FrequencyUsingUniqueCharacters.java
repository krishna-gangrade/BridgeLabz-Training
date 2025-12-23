import java.util.Scanner;

//Create class  FrequencyUsingUniqueCharacters
public class FrequencyUsingUniqueCharacters {

    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = text.charAt(i);
            }
        }
        return unique;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        int index = 0;
        for (char ch : uniqueChars) {
            if (ch != '\0') {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);

        System.out.println("Character Frequency:");
        for (String[] row : freq) {
            if (row[0] != null) {
                System.out.println(row[0] + " : " + row[1]);
            }
        }
    }
}
