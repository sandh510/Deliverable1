package ca.sheridancollege.project;

/**
 * A class that models each Player in the War game.
 */
public class Player {

    private final String name;
    private final GroupOfCards hand;

    public Player(String name) {
        this.name = name;
        this.hand = new GroupOfCards();
    }

    public String getName() {
        return name;
    }

    /**
     * Adds a card to the player's hand.
     * @param card the card to add
     */
    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    /**
     * Removes and returns a card from the player's hand.
     * @return the card removed from the hand
     */
    public Card playCard() {
        return hand.removeTopCard();
    }

    /**
     * Checks if the player's hand is empty.
     * @return true if the hand is empty, false otherwise
     */
    public boolean isHandEmpty() {
        return hand.isEmpty();
    }

    /**
     * Gets the number of cards in the player's hand.
     * @return the number of cards in the hand
     */
    public int getHandSize() {
        return hand.getSize();
    }

    /**
     * Clears the player's hand.
     */
    public void clearHand() {
        hand.getCards().clear();
    }
}
