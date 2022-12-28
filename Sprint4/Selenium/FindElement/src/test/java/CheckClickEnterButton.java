import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;

public class CheckClickEnterButton {

    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Найди кнопку и кликни по ней
        driver.findElement(By.xpath(".//button[@class='auth-form__button']")).click();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}