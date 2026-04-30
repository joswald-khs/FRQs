
/**
 * Write a description of class WordGrid here.
 *
 * @author CollegeBoard, Jason Oswald
 * @version 2026
 */
public class WordGrid {
    private String[][] grid;
    
    /**
    * Returns the number of rows in grid that are ordered from
    * shortest string to longest string
    * Preconditions: grid has at least one row and at least two
    * columns.
    * No elements in grid are null.
    * Postcondition: grid is unchanged.
    */
    public int countOrderedRows() { 
        int orderedRowCount = 0;
        
        for( int i = 0; i < grid.length; i++ ) {
            if( isRowInOrder(i) ) {
                orderedRowCount++;
            }
        }
        
        return orderedRowCount;
    }
    
    private boolean isRowInOrder(int i) {
        for( int j = 0; j < grid[i].length - 1; j++ ) {
            if( grid[i][j].length() > grid[i][j+1].length() ) {
                return false;
            }
        }
        return true;
    }
    
/* There may be instance variables, constructors,
and methods that are not shown. */
    
}