/*Напиши тест, который будет сравнивать длину обычного и високосного года.
Високосный год длиннее обычного на одни сутки. Если тест упадёт,
должна вывестись ошибка «Продолжительность должна отличаться».
*/

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class test4 {
    @Test
    public void shouldBeNotSameDuration() {
        // напиши код тут
        int standartYearDuration = 365;
        int leapYearDuration = 364;

        assertNotEquals(standartYearDuration, leapYearDuration, "Продолжительность должна отличаться");
    }
}
