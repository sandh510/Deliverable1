package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that represents a group of cards in the War game.
 */
public class GroupOfCards {

    private final ArrayList<Card> cards;

    /**
     * Constructs a new GroupOfCards instance.
     */
    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    /**
     * Gets the list of cards in the group.
     * @return the list of cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Adds a card to the group.
     * @param card the card to add
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Removes and returns the top card from the group.
     * @return the top card
     */
    public Card removeTopCard() {
        return cards.remove(0);
    }

    /**
     * Gets the number of cards in the group.
     * @return the number of cards
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Checks if the group is empty.
     * @return true if the group is empty, false otherwise
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Shuffles the cards in the group.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
