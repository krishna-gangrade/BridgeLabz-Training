import java.util.Scanner;

// Create class CharacterFrequencyASCII
public class CharacterFrequencyASCII {

    // Method to find frequency of characters using ASCII
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!=' ')
            freq[text.charAt(i)]++;
        }

        // Result array (max size = length of text)
        String[][] result = new String[text.length()][2];
        int index = 0;

        // Store character and frequency only once
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // mark as processed
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

        System.out.println("\nCharacter Frequency:");
        for (String[] row : freq) {
            if (row[0] != null) {
                System.out.println(row[0] + " : " + row[1]);
            }
        }
        sc.close();
    }
}
