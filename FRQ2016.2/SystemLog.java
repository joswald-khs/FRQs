import java.util.List;
import java.util.ArrayList;

/**
 * The SystemLog class represents a list of LogMessage objects and provides
 * a method that removes and returns a list of all log messages (if any) 
 * that properly contain a given keyword. The messages in the returned list
 * appear in the same order in which they originally appeared in the system
 * log. If no message properly contains the keyword, an empty list is 
 * returned. The declaration of the SystemLog class is shown below. 
 *
 * @author The College Board
 * @version 2016
 */
public class SystemLog {
    /**
     * Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private List<LogMessage> messageList;
    
    /** 
     * Removes from teh system log all entries whose descriptions
     * <i>properly</i> contain keyword, and reeturns a list (possibly
     * empty) containing the removed entries.
     * <br/><br/>
     * <b>Postcondition</b>:
     * <ul>
     * <li>Entries in the returned list <i>properly</i> contain keyword
     *   and are in the order in which they appeared in the system log</li>
     * <li>The remaining entries in the system log do not <i>properly</i>
     *   contain keyword and are in their original order.</li>
     * <li>The returned list is empty if no messages properly contain
     *   keyword.</li>
     * </ul>
     */
    public List<LogMessage> removeMessages(String keyword) {
        /* to be implemented in part (c) */
        return new ArrayList<LogMessage>();
    }
    
    public SystemLog() {
        messageList = List.of(
            new LogMessage("CLIENT3:security alert - repeated login failures"),
            new LogMessage("Webserver:disk offline"),
            new LogMessage("SERVER1:file not found"),
            new LogMessage("SERVER2:read error on disk DSK1"),
            new LogMessage("SERVER1:write error on disk DSK2"),
            new LogMessage("Webserver:error on /dev/disk")
        );
    }
    
    public List<LogMessage> getMessages() { return messageList; }
}