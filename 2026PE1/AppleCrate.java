
/**
 * Write a description of class AppleCrate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppleCrate
{
    private Apple[][] apples;
    
    public int numberOfPies(double poundsPerPie) {
        double goodApplesWeight = 0;
        
        for( int i = 0; i < apples.length; i++ ) {
            for( int j = 0; j < apples[i].length; j++ ) {
                if( shouldAdd(i,j) ) {
                    goodApplesWeight += apples[i][j].getWeight();
                }
            }
        }
        return (int) (goodApplesWeight/poundsPerPie);
        
    }
    
    public boolean shouldAdd(int i, int j) {
        if( apples[i][j].isRotten() ) {
            return false;
        } else if( i > 0 && apples[i-1][j].isRotten() ) { // above 
            return false;
        } else if( i < apples.length - 1 && apples[i+1][j].isRotten() ) { // below
            return false;
        } else if( j > 0 && apples[i][j-1].isRotten() ) { // left
            return false;
        } else if( j < apples[i].length - 1 && apples[i][j+1].isRotten() ) { // right
            return false;
        } else {
            return true;
        }
        // check i, j isRotten
        // check (i-1),j ... also boundary check
        // check (i+1),j ... also boundary check
        // check i, (j-1)... also boundary check
        // check i, (j+1)... also boundary check
    }
}