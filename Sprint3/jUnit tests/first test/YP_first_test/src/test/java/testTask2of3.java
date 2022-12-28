/*
Теперь добавь ещё два теста checkIsAdultWhenAgeIsLessThan18False и checkIsAdultWhenAgeIs18True.
Они проверят, что метод checkIsAdult вернёт false, если пользователю меньше 18 лет, и true,
если пользователю ровно 18 лет.
Не забудь добавить понятный текст ошибки на случай, если тест упадёт.
 */

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class testTask2of3<Program> {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }

    // Напиши код здесь
    @Test

    public void checkIsAdultWhenAgeIsLessThan18False() {

        Program program = new Program();

        boolean isAdult = program.checkIsAdult(17);

        assertEquals("Должно вернуться false, так как пользователь младше 18", false, isAdult);

    }

    @Test

    public void checkIsAdultWhenAgeIs18True() {

        Program program = new Program();

        boolean isAdult = program.checkIsAdult(18);

        assertEquals("Должно вернуться false, так как пользователь совершеннолетний", true, isAdult);

    }
}
