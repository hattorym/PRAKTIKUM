/*Допиши тест, который проверяет,
что температуры по Цельсию и Фаренгейту не равны при одинаковых значениях.
Добавь понятный текст ошибки на случай, если тест упадёт.
*/
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;


public class test3 {

    @Test
    public void shouldBeNotEqualCelsiusAndFahrenheit() {
        double celsius = 36;
        double fahrenheit = 5 / 9 * (celsius - 32);

        // напиши код тут
        assertNotEquals(celsius, fahrenheit, "Температуры в разных системах не равны");
    }

}
