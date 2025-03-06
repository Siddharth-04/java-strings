import java.util.Scanner;

public class DeckOfCards {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int numOfCards = suits.length * ranks.length;

    private static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }
        String[][] players = new String[numPlayers][numCards];
        int index = 0;
        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[index++];
            }
        }
        return players;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = scanner.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, numPlayers, numCards);
        
        if (players != null) {
            for (int i = 0; i < numPlayers; i++) {
                System.out.println("Player " + (i + 1) + " cards:");
                for (int j = 0; j < numCards; j++) {
                    System.out.println(players[i][j]);
                }
                System.out.println();
            }
        }
    }
}
/*
    Enter number of players: 2
    Enter number of cards per player: 5
    Player 1 cards:
    Ace of Spades
    5 of Spades
    6 of Spades
    Queen of Diamonds
    7 of Spades

    Player 2 cards:
    5 of Clubs
    9 of Clubs
    King of Hearts
    King of Spades
    King of Diamonds

*/