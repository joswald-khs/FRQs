
/**
 * From Practice Exam 1
 *
 * @author College Board
 * @version 2025-2026
 */
public class RaceCar {
    public java.util.Map<Integer,Double> times = new java.util.HashMap<Integer,Double>();
    
    /** 
     * Returns the number of seconds it takes
     * a car to complete the lap specified
     * by the parameters
     */    
    public double getLapTime(int lapNum) {
        times.computeIfAbsent(lapNum, x -> Math.random() );
        return times.get(lapNum);
    }    
}