
/**
 * From Practice Exam 1
 *
 * @author College Board and Jason Oswald
 * @version 2025-2026
 */

public class CubePair {
    private Cube cube1;
    private Cube cube2;
    
    public CubePair(String typeA, String typeB) {
        cube1 = new Cube(typeA);
        cube2 = new Cube(typeB);
    }
    
    public CubePair(String type) {
        this(type,type);
        // cube1 = new Cube(type);
        // cube2 = new Cube(type);
    }
    
    public String rollCubes() {
        return cube1.roll() + cube2.roll();
    }
}