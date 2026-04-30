
/**
 * From Practice Exam 1
 *
 * @author College Board
 * @version 2025-2026
 */
public class SimulateCarRace {
    private RaceCar carOne;
    private RaceCar carTwo;
    
    public SimulateCarRace() {
        carOne = new RaceCar();
        carTwo = new RaceCar();
    }
    
    /**
     * Simulates a race with numLaps and returns a
     * String indicating the outcome as described in
     * part (a)
     * 
     * Precondition: numLaps > 0
     */
    public String findWinner(int numLaps) {
        double carOneTotalTime = 0;
        double carTwoTotalTime = 0;
        
        for( int i = 1; i <= numLaps; i++ ) {
            carOneTotalTime += carOne.getLapTime(i);
            carTwoTotalTime += carTwo.getLapTime(i);
        }
        
        if( carOneTotalTime < carTwoTotalTime ) {
            return "Car 1 Wins!";
        } else if( carTwoTotalTime < carOneTotalTime ) {
            return "Car 2 Wins!";
        } else {
            return "Tie!";
        }        
    }
    
    /** 
     * Returns a shortened version of the parameter
     * message with all substrings that are equal to
     * the parameter str removed, as described in 
     * part (b)
     *  
     * Precondition: There are no overlapping occurences
     * of str within message. 
     */
    public String shortenMessage(String message, String str) {
        String shortenedMessage = message;       
        
        int i = message.indexOf(str);
        while( i > -1 ) {
            shortenedMessage = shortenedMessage.substring(0, i) + shortenedMessage.substring(i+str.length());
            i = shortenedMessage.indexOf(str);
        }
        
        return shortenedMessage;
    }
}