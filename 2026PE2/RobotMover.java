
/**
 * Write a description of class RoboMover here.
 *
 * @uthor College Board, Jason Oswald
 * @version 2026
 */
public class RobotMover
{
    private static final String[] POSSIBLE_MOVES = {"up_","down_","left_","right_"};
    
    private String moveSequence;
    /**
    * Initalizes moveSequence with numMoves moves, with an equal
    * chance of "up", "down", "left", and "right". Each move is
    * followed by an underscore ("_").
    * Precondition: numMoves > 0
    */
    public RobotMover(int numMoves) { 
        moveSequence = "";
        for( int i = 0; i < numMoves; i++ ) {
            moveSequence += getRandomMove();
        }
    }
    
    public RobotMover(String moves) {
        moveSequence = moves;
    }
    
    private String getRandomMove() {
        return POSSIBLE_MOVES[(int) (Math.random() * POSSIBLE_MOVES.length)];
    }
    /**
    * Returns the number of times that str appears in moveSequence
    * Precondition: moveSequence is a valid sequence of moves,
    * each followed by an underscore.
    * Postcondition: moveSequence is unchanged.
    */
    public int countOccurrences(String str) { 
        int occurences = 0;
        String searchString = moveSequence;
        int i = searchString.indexOf(str);
        while( i != -1 && i < searchString.length() ) {
            occurences++;
            searchString = searchString.substring(i+1);
            i = searchString.indexOf(str);
        }
        
        return occurences;
    }
}