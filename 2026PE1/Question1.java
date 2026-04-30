

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Question1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Question1 {
    @Test
    public void testPartB()
    {
        SimulateCarRace simulate1 = new SimulateCarRace();
        assertEquals("driver_of_first_car_is_Jerry", simulate1.shortenMessage("the_driver_of_the_first_car_is_Jerry", "the_"));
    }
}

