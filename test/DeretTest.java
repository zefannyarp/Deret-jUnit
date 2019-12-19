import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ZEFANNYA RP
 */
public class DeretTest {
    
    public DeretTest() {
    }

    /**
     * Test of Deret method, of class Deret.
     */
    @Test
    public void testFibonacci() {
        Deret fibonacci = new Deret (10000, 1, 0, 0);
        int expected = 10000;
        int actual = fibonacci.getN();
        assertEquals(expected, actual);
    }
}
