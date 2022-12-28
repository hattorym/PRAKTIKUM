import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test1 {

    @Test
    public void shouldBeCorrectCalculations(){
        double S = 100.0;
        double t = 20.0;
        double V = S / t;
        double expected = 5.0;

        // напиши код тут
        assertEquals(expected, V, 0);
    }
}
