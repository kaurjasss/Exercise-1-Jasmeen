package exercise1;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Jasmeen Kaur February 6, 2024
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card(Card.SUITS[(int) (Math.random() * 4)], (int) (Math.random() * 13) + 1);
            magicHand[i] = c;
        }

        // Print the magicHand
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0-Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = scanner.nextInt();

        if (userSuitIndex < 0 || userSuitIndex >= Card.SUITS.length) {
            System.out.println("Invalid suit index entered.");
            return;
        }

        String userSuit = Card.SUITS[userSuitIndex];

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

        // result
        if (found) {
            System.out.println("Congratulations, your card is in the magic hand!");
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    public static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is jasmeen kaur, You can call me jas!!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println(" I would like to be a software developer");
        System.out.println(" Travel the world with my family");
        System.out.println(" helping people");
        System.out.println();    

        System.out.println("My hobbies:");
        System.out.println(" playing basketball");
        System.out.println(" Reading");
        System.out.println(" binge watching netflix");

        System.out.println();
    }
}