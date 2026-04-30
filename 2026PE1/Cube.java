
/**
 * From Practice Exam 1
 *
 * @author College Board and Jason Oswald
 * @version 2025-2026
 */
public class Cube {
    private enum Type {
        NUMBER, LETTER, COLOR;
        
        private String[] numbers = {"1","2","3","4","5","6"};
        private String[] letters = {"A","B","C","D","E","F"};
        private String[] colors = {"red","orange","yellow","green","blue","purple"};
        
        private String[] getValues() {
            switch(this) {
                case NUMBER: return numbers;
                case LETTER: return letters;
                case COLOR: return colors;
            }
            
            return null;
        }
        
        public String getRandomValue() {
            return this.getValue((int) (Math.random() * 6));
        }
        
        private String getValue(int i) {
            return this.getValues()[i];
        }
    }
    
    private Type type;
    
    public Cube(String cubeType) {
        if( cubeType.equals("number") ) type = Type.NUMBER;
        if( cubeType.equals("letter") ) type = Type.LETTER;
        if( cubeType.equals("color" ) ) type = Type.COLOR;
    }
    
    public String roll() {
        return type.getRandomValue();
    }
    
    // public boolean isValidString(String value) {
        // String arr[] = this.type.getValues();
        // for( String x : arr ) {
            // if( x.equals(value) ) return true;
        // }
        // return false;
    // }
}