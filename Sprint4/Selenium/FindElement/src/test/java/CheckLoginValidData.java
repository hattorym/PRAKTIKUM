import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.After;

public class CheckLoginValidData {

    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Найди поле "Email" и заполни его
        driver.findElement(By.id("email")).sendKeys("burtsev_15@yandex.ru");
        // Найди поле "Пароль" и заполни его
        driver.findElement(By.id("password")).sendKeys("1qaz2wsx3d");
        // Найди кнопку "Войти" и кликни по ней
        driver.findElement(By.className("auth-form__button")).click();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}