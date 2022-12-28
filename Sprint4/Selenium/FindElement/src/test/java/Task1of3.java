/*
Напиши программу, которая запустит клик по изображению профиля — используй CSS и класс элемента.
Найди изображение через поиск по id — в открывшемся окне в поле ссылки на изображение введи ссылку
https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenium.png.
Сохрани новое изображение — пользуйся поиском по XPath. После корневого элемента ищи элемент form и
его атрибут name. Найди кнопку через поиск элемента и поиск текста.
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1of3 {

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
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("profile__image")));
        // Кликни по изображению профиля
        driver.findElement(By.className("profile__image")).click();
        // В поле ссылки на изображение введи ссылку
        driver.findElement(By.id("owner-avatar")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenium.png");
        // Сохрани новое изображение
        driver.findElement(By.xpath(".//form[@name='edit-avatar']/button[text()='Сохранить']")).click();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}