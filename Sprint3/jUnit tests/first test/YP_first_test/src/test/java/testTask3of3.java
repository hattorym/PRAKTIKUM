/*
Тесты из предыдущего задания можно объединить в один параметризованный тест.
Так код будет поддерживаемым и с ним будет удобнее работать.
Допиши параметризованный тест checkIsAdultWhenAgeThenResult, который проверит возраст из
каждого класса эквивалентности. Учти, что код приложения пишут люди из разных стран, и
в некоторых совершеннолетие наступает в 21 год.
В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки.
Реализуй это требование с помощью двумерного массива аргументов.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result; // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getAgeData() {
        return new Object[][] {
                {17, false},
                {18, true},
                {19, true},
                {21, true}, // Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        int userAge =  age;// Передай сюда возраст пользователя
        boolean isAdult = program.checkIsAdult(userAge);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Возраст не подходит", result, isAdult);
    }
}
