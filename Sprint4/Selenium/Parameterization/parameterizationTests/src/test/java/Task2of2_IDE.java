
/*
Теперь попробуй использовать параметризацию для поиска однотипных элементов на странице.
Пусть тест проверит, что среди представленных городов на главной странице сервиса есть Москва и Санкт-Петербург.
Тебе понадобятся поля cityName и isVisible.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task2of2_IDE {
    //Добавь необходимые поля
    private final String cityName;
    private final boolean isVisible;

    public void TestClass(String cityName, boolean isVisible) {
        this.cityName = cityName;
        this.isVisible = isVisible;

    }

    @Parameterized.Parameters
    public static Object[][] getCities() {
        //Сгенерируй тестовые данные (нам нужно название городов и результат поиска)
        return new Object[][]{
                {"Москва", true},
                {"СПб", true},
                {"Ставрополь", true},
                {"Москва-сити", true},
        };
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void citiesTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Выполни авторизацию. Укажи email и пароль своей учетной записи
        driver.findElement(By.id("email")).sendKeys("burtsev_15@yandex.ru");
        driver.findElement(By.id("password")).sendKeys("1qaz2wsx3d");
        driver.findElement(By.className("auth-form__button")).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));

        // Найди карточку города по его названию
        String cityStringFormat = String.format(".//*[text()='%s']", cityName);

        List<WebElement> elements = driver.findElements(By.xpath(cityStringFormat));

        // Проверь, что нашёлся хотя бы один нужный элемент
        assertEquals(isVisible, elements.size() != 0);

        driver.quit();
    }
}