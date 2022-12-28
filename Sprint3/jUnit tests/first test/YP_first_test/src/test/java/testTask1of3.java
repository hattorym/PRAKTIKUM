/*
Метод checkIsAdult класса Program принимает в качестве аргумента возраст и возвращает true,
если пользователю 18 лет или больше, и false, если пользователь младше 18 лет.
Допиши проверку в тест, который проверяет, что если пользователю больше 18 лет,
то вернётся true. Добавь понятный текст ошибки на случай, если тест упадёт.
Обрати внимание, каким образом вызывается метод checkIsAdult:
Сначала создают объект класса Program, внутри него этот метод.
После этого вызывают сам метод — так вызывают метод снаружи класса.
 */

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class testTask1of3<Program> {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        // Напиши код здесь
        assertEquals("Вам должно быть больше 18 лет.", true, isAdult);
    }
}