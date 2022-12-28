import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test2 {

    @Test
// напиши код тут
    public void shouldBeTwoBooleansEqual() {
        boolean a = 9 != 10;
        boolean b = 10 > 11;

        // напиши код тут
        assertEquals("Логические выражения не равны", a, b);
    }
}
