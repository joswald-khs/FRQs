
/**
 * Write a description of interface Player here.
 * 
 * Defined as interface so that references in PlayerAnalysis function
 *
 * @author College Board, Jason Oswald
 * @version 2026
 */
public interface Player
{
    /**
    * Returns a unique ID for the player
    */
    public String getID();
    /**
    * Returns the player’s score in the game,
    * guaranteed to be nonnegative
    */
    public int getScore();
    /* There may be instance variables, constructors, and methods
    that are not shown. */
}