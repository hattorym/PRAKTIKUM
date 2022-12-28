/*
Напиши параметризованный тест для на формы авторизации тестового стенда. Нужно проверить,
может ли пользователь войти в систему по определённому логину и паролю.
Назови поля email, password и isLoggedIn.
Для тестовых данных возьми свои учётные данные и несколько случайных. Например:
{"qwerty@gmail.com", "Pw123456", true},
{"email2@test.example", "password2", false}.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task1of2_IDE {
    //Добавь необходимые поля
    private final String email;
    private final String password;
    private final boolean isLoggedIn;

    public void TestTask1of2(String email, String password, boolean isLoggedIn) {
        this.email = email;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        //Сгенерируй тестовые данные (свою учётку и несколько случайных)
        return new Object[][]{
                {"burtsev_15@yandex.ru", "1qaz2wsx3d", true},
                {"qwerty@gmail.com", "Pw123456", true},
                {"email2@test.example", "password2", false},
        };
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-mesto.praktikum-services.ru/");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("auth-form__button")).click();
        if (isLoggedIn) {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        }
        assertEquals(isLoggedIn, driver.findElements(By.cssSelector(".profile__image")).size() != 0);
        driver.quit();
    }
}