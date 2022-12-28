import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.junit.After;

// Импорт для работы с List
import java.util.List;

public class FindTaggedElementsTest {

    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Найди все элементы
        List<WebElement> elements = driver.findElements(new By.ByXPath("$x(.//img))"));
        /* Для наглядности выведи количество элементов в списке на экран.
        Чтобы получить размер коллекции List, нужно вызвать метод size() 
        (с коллекциями ты познакомишься позже) */
        System.out.println(elements.size());
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}