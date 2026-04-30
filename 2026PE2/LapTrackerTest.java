

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LapTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LapTrackerTest
{
    /**
     * Default constructor for test class LapTrackerTest
     */
    public LapTrackerTest()
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

    @Test
    public void amyTest()
    {
        LapTracker lapTrack1 = new LapTracker(3);
        assertEquals(8, lapTrack1.addLaps(8));
        assertEquals(20, lapTrack1.addLaps(12));
        assertEquals(30, lapTrack1.addLaps(10));
        assertEquals(11, lapTrack1.addLaps(11));
        assertEquals(16, lapTrack1.addLaps(5));
        assertEquals(29, lapTrack1.addLaps(13));
        assertEquals(7, lapTrack1.addLaps(7));
    }

    @Test
    public void eveTest()
    {
        LapTracker lapTrack1 = new LapTracker(2);
        assertEquals(20, lapTrack1.addLaps(20));
        assertEquals(33, lapTrack1.addLaps(13));
        assertEquals(10, lapTrack1.addLaps(10));
    }
}

