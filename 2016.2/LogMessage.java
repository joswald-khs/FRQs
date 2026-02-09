
/**
 * Log messages have the format machineId:description, where machineId
 * identifies the computer and description describes the event being logged.
 * Exactly one colon (":") appears in a log message. There are no blanks 
 * either immediately before or immediately after the colon.
 *
 * @author The College Board
 * @version 2016
 */
public class LogMessage {
    private String machineId;
    private String description;
    
    /** <b>Precondition</b>: message is a valid log message. */
    public LogMessage(String message) {
        String[] splitResults = message.split(":");
        machineId = splitResults[0];
        description = splitResults[1];
    }
    
    /** 
     * @param keyword the search string
     * @return true if the description in this log message <i>properly</i> 
     * contains keyword; false otherwise.
     */
    public boolean containsWord(String keyword) {
        String searchString = description; 
        int i = description.indexOf(keyword);
        System.out.println(i);
        if( i == -1 ) { return false; } 
        else if( description.equals(keyword ) ) { return true; }
        else {
            if( description.indexOf( " " + keyword ) == -1 && 
                description.indexOf( keyword + " " ) == -1 ) {
                return false;
            } else {
                return true;
            }
        }
    }
    
    public String getMachineId() { return machineId; }
    public String getDescription() { return description; }
    
    // There may be instance variables, constructors, and methods 
    // that are not shown. 
}