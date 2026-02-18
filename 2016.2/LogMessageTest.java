

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * The test class LogMessageTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LogMessageTest
{
    /**
     * Default constructor for test class LogMessageTest
     */
    public LogMessageTest()
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
    public void testConstructor() {
        LogMessage message = new LogMessage("CLIENT3:security alert - repeated login failures");
        assertEquals( "CLIENT3", message.getMachineId() );
        assertEquals( "security alert - repeated login failures", message.getDescription() );
    }
    
    @Test
    public void testProperlyContainsWord() {
        List<LogMessage> containsKeywordMessages = List.of(
            new LogMessage("CLIENT1:disk"),
            new LogMessage("CLIENT2:error on disk"),
            new LogMessage("CLIENT3:error on /dev/disk disk"),
            new LogMessage("CLIENT4:error on disk DSK1")
        );
        
        final String keyword = "disk";
        
        for( LogMessage m : containsKeywordMessages ) {            
            assertTrue( m.containsWord(keyword) );
        }
    }
    
    @Test
    public void testDoesNotContainWord() {
        List<LogMessage> doesNotcontainKeywordMessages = List.of(
            new LogMessage("CLIENT1:DISK"),
            new LogMessage("CLIENT2:error on disk1"),
            new LogMessage("CLIENT3:error on /dev/disk"),
            new LogMessage("CLIENT4:diskette")
        );
        
        final String keyword = "disk";
        
        for( LogMessage m : doesNotcontainKeywordMessages ) {
            assertFalse( m.containsWord(keyword) );
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