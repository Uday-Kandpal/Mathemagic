
package core;

/**
 *
 * @author Uday Kandpal
 */
public class Maths {

    public static double roundTo10Digits(double d) {
        return ((long) (d * 1e10)) / 1e10;
    }

    public Maths() {
    }
    
}
