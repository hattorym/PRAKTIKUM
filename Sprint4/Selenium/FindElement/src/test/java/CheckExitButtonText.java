import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckExitButtonText {

    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Это блок авторизации
        driver.findElement(By.id("email")).sendKeys("burtsev_15@yandex.ru");
        driver.findElement(By.id("password")).sendKeys("1qaz2wsx3d");
        driver.findElement(By.className("auth-form__button")).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        // Найди кнопку и получи её текст
        String text = driver.findElement(By.className("header__logout")).getText();
        System.out.println("Текст кнопки: " + text);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}