

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RobotMoverTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotMoverTest
{
    /**
     * Default constructor for test class RobotMoverTest
     */
    public RobotMoverTest()
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
    public void testCountOccurences()
    {
        RobotMover robotMov1 = new RobotMover("right_down_left_down_right_down_up_up_up_");
        assertEquals(2, robotMov1.countOccurrences("right"));
        assertEquals(3, robotMov1.countOccurrences("down"));
        assertEquals(2, robotMov1.countOccurrences("right_d"));
        assertEquals(2, robotMov1.countOccurrences("up_up"));
    }
}
