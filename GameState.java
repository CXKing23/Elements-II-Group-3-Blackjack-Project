/**
 * Write a description of class GameState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum GameState {
    START_SCREEN, // State representing the start screen
    BET,          // State representing the betting phase
    DEAL,         // State representing the dealing of cards
    PLAY,         // State representing the player's turn
    D_PLAY,       // State representing the dealer's turn
    FIND_WINNER,  // State representing the process of finding the winner
    GAME_OVER,    // State representing the end of the game
    RESET;        // State representing the game reset
}
