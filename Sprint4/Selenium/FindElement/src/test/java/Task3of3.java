/*
Напиши программу, которая сделает скролл до первой найденной карточки контента, используй поиск по CSS-селектору.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task3of3 {

    private WebDriver driver;

    @Test
    public void test() {
        // Создаём драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Выполни авторизацию
        // Найди поле "Email" и заполни его
        driver.findElement(By.id("email")).sendKeys("burtsev_15@yandex.ru");
        // Найди поле "Пароль" и заполни его
        driver.findElement(By.id("password")).sendKeys("1qaz2wsx3d");
        // Найди кнопку "Войти" и кликни по ней
        driver.findElement(By.className("auth-form__button")).click();

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("places__list")));
        // Найди карточку контента и сделай скролл до неё
        WebElement element = driver.findElement(By.cssSelector(".places__item"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}