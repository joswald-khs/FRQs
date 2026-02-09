

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * The test class SystemLogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SystemLogTest
{
    /**
     * Default constructor for test class SystemLogTest
     */
    public SystemLogTest()
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
    
    @Test
    public void testRemove() {
        List<LogMessage> correctRemovedMessages = List.of(
            new LogMessage("Webserver:disk offline"),
            new LogMessage("SERVER2:read error on disk DSK1"),
            new LogMessage("SERVER1:write error on disk DSK2")
        );    
        
        List<LogMessage> correctRemainingMessages = List.of(
            new LogMessage("CLIENT3:security alert - repeated login failures"),
            new LogMessage("SERVER1:file not found"),
            new LogMessage("Webserver:error on /dev/disk")        
        );
        
        SystemLog log = new SystemLog();
        List<LogMessage> removedMessages = log.removeMessages("disk");
        System.out.println(removedMessages);
        System.out.println(log.getMessages() );
        assertEquals( correctRemovedMessages, removedMessages );
        assertEquals( correctRemainingMessages, log.getMessages() );
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