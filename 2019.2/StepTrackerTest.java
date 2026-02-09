

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * The test class StepTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StepTrackerTest
{
    StepTracker tr;
    /**
     * Default constructor for test class StepTrackerTest
     */
    public StepTrackerTest()
    {
    }

    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tr = new StepTracker(10000);
    }
    
    @DisplayName("Testing Constructor")
    @Test    
    public void testConstructor() {
        assertEquals( 0, tr.activeDays() );
        assertEquals( 0.0, tr.averageSteps() );        
    }

    
    @DisplayName("First two days")
    @Nested    
    class FirstTwoDays {
        @BeforeEach
        void day1Entries() {
            tr.addDailySteps(9000);
            tr.addDailySteps(5000);
        }
        
        @Test
        void validate() {
            assertEquals( 0, tr.activeDays() );
            assertEquals( 7000.0, tr.averageSteps() );               
        }
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
