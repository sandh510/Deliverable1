package ca.sheridancollege.project;

/**
 * A class to represent a playing card.
 * @modifier Gurleen Kaur
 * @modifier Jasmeen Kaur
 * @modifier Gursirat Singh
 * @modifier Armandeep Singh
 */
public class Card {

    private final String suit;
    private final String rank;

    /**
     * Constructs a Card object with the specified suit and rank.
     * @param suit the suit of the card (e.g., "Hearts", "Diamonds", "Clubs", "Spades")
     * @param rank the rank of the card (e.g., "Ace", "2", "3", ..., "King")
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Returns the rank of the card.
     * @return the rank of the card
     */
    public String getRank() {
        return rank;
    }

    /**
     * Returns the suit of the card.
     * @return the suit of the card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns a string representation of the card.
     * @return a string representation of the card in the format "rank of suit" (e.g., "Ace of Hearts")
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
