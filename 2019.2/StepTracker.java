import java.util.ArrayList;

/**
 * This question involves the implementation of a fitness tracking system
 * that is represented by the StepTracker class. A StepTracker object is
 * created with a parameter that defines the minimum number of steps that
 * must be taken for a day to be considered active
 * 
 * The StepTracker class provides a constructor and the following methods:
 * 
 * <ul>
 * <li>addDailySteps, which accumulates information about steps in readings
 * taken once per day</li>
 * <li>activeDays, which returns the number of active days</li>
 * <li>averageSteps, which returns the average number of steps per day,
 * calculated by dividing the total number of steps taken by the number of
 * days tracked</li>
 * </ul>
 *
 * @author The College Board
 * @version 2019
 */
public class StepTracker{
    private ArrayList<Integer> dailySteps = new ArrayList<Integer>();
    private final int THRESHOLD;
    private int activeDays = 0;
    
    public StepTracker( int threshold ) {
        THRESHOLD = threshold;
    }
    
    public void addDailySteps( int steps ) {
        dailySteps.add(steps);
        if( steps > THRESHOLD ) { activeDays++; } 
        System.out.println( steps + "<>" + THRESHOLD + ", " + dailySteps.size() );
    }
    
    public int activeDays() { return activeDays; }
    
    public double averageSteps() { 
        if( dailySteps.size() == 0 ) { return 0; }
        double average = 0;
        for( int ds : dailySteps ) {
            average += ds;
        }
        return average / dailySteps.size();
    }
}