
/**
 * The LapTracker class, which you will write, is is used to 
 * count the number of laps a person walks around a track.
 * 
 * LapTracker objects are created by calls to a constructor 
 * with an int parameter that indicates how often to reset the
 * LapTracker, with a precondition that the parameter is 
 * always positive. Newly constructed LapTracker objects start 
 * with a lap count of 0.
 * 
 * The LapTracker class contains an addLaps method, which adds 
 * laps to the lap count. This method has an int parameter 
 * that represents the number of laps to be added, with a 
 * precondition that the parameter is always positive. A 
 * LapTracker object repeatedly resets its lap count to 0 after 
 * a number of calls to addLaps, as indicated by its 
 * constructor parameter.
 * 
 * The addLaps method returns an int that represents the lap 
 * count, as illustrated in the following table.
 * 
 * The table contains a sample code execution sequence and the 
 * corresponding results. The code execution sequence appears
 * in a class other than LapTracker.
 *
 * @author Jason Oswald
 * @version 2026
 */
public class LapTracker {
    private int lapCount = 0;
    private int addLapsCallCount = 0;
    private final int resetInterval;
    
    // precondition: resetInterval is always positive
    public LapTracker(int resetInterval) {
        this.resetInterval = resetInterval;
    }
    
    // precondition: resetInterval is always positive
    // returns: the total number of laps (prior to a reset);
    public int addLaps(int lapsToAdd) {
        lapCount += lapsToAdd;
        int totalLaps = lapCount;
        addLapsCallCount++;
        if( addLapsCallCount == resetInterval ) {
            addLapsCallCount = 0;
            lapCount = 0;
        }
        return totalLaps;
    }
}