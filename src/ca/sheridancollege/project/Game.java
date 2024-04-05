package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 */
public abstract class Game {

    private final String name; // the title of the game
    private ArrayList<Player> players; // the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Add a player to the game.
     *
     * @param player the player to add
     */
    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    /**
     * Remove a player from the game.
     *
     * @param player the player to remove
     */
    public void removePlayer(Player player) {
        players.remove(player);
    }

    /**
     * Check if a player is already in the game.
     *
     * @param player the player to check
     * @return true if the player is in the game, false otherwise
     */
    public boolean hasPlayer(Player player) {
        return players.contains(player);
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
