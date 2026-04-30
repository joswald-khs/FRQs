import java.util.ArrayList;

/**
 * Write a description of class EVDataSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EVDataSet {
    private ArrayList<ElectricVehicle> vehicleList;
    
    public ArrayList<String> getHighRangeVehicles(int target) {
        ArrayList<String> results = new ArrayList<String>();
        for( ElectricVehicle v : vehicleList ) {
            if( v.getRange() > target ) {
                boolean foundDuplicate = false;
                for( String r : results ) {
                    if( r.equals(v.getModelName()) ) {
                        foundDuplicate = true;
                    }
                }
                if( !foundDuplicate ) {
                    results.add( v.getModelName() );
                }
            }
        }
        return results;
    }
}