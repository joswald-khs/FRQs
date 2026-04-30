import java.util.ArrayList;

/**
 * Write a description of class PlayerAnalysis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerAnalysis
{
    /** The list of all players */
    private ArrayList<Player> playerList;
    /**
    * Returns the ID of the player whose score is closest to
    * targetScore
    * Preconditions: playerList is not null.
    * No elements of playerList are null.
    * playerList is not empty.
    * Postcondition: playerList is unchanged.
    */
    public String playerWithClosestScore(int targetScore) {
        Player closestPlayer = playerList.get(0);
        int closestDistance = Math.abs(targetScore - closestPlayer.getScore());
        for( Player p : playerList ) {
            final int d = Math.abs(targetScore - p.getScore());
            if( d < closestDistance ) {
                closestDistance = d;
                closestPlayer = p;
            }
        }
        return closestPlayer.getID();
    }
    
    /* There may be instance variables, constructors, and methods
    that are not shown. */
}