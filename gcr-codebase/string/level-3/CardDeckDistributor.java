//Writing a Java Code to Distribute a Deck of Cards to Players
import java.util.Scanner;

public class CardDeckDistributor {

    // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static String[] shuffleDeck(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));

            // swap
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players) {

        if (deck.length % players != 0) {
            System.out.println("Cards cannot be equally distributed.");
            return null;
        }

        int cardsPerPlayer = deck.length / players;
        String[][] hands = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                hands[i][j] = deck[index++];
            }
        }
        return hands;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] hands) {

        if (hands == null) return;

        for (int i = 0; i < hands.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (String card : hands[i]) {
                System.out.println("  " + card);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"
        };

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] hands = distributeCards(deck, players);
        printPlayersCards(hands);

        sc.close();
    }
}
