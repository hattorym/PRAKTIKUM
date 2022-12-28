/*
Напиши программу, которая нажмёт кнопку добавления нового контента, — используй поиск по классу.
Откроется окно — в поле «Название» введи «Москва», а в поле ссылки на изображение введи ссылку
https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenium.jpg.
Это можно сделать через поиск по атрибуту name.
Сохрани контент — примени поиск по XPath, после корневого элемента ищи элемент form и его атрибут name.
Найди кнопку через поиск по элементу и поиск по тексту.
После тестирование нужно привести стенд в начальное состояние. Контент нужно удалить — дождись, когда
появится кнопка удаления карточки. Примени поиск по XPath через относительный путь до элемента и значение
его атрибута class. Кликни по кнопке.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.DocFlavor;

public class Task2of3 {

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
        // Кликни по кнопке добавления нового контента
        driver.findElement(By.className("profile__add-button")).click();
        // В поле названия введи Москва
        driver.findElement(By.id("place-name")).sendKeys("Москва");
        // В поле ссылки на изображение введи ссылку
        driver.findElement(By.id("place-link")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenium.jpg");
        // Сохрани контент
        driver.findElement(By.xpath(".//form[@name='new-card']/button[text()='Сохранить']")).click();
        // Дождись появления кнопки удаления карточки
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@class='card__delete-button card__delete-button_visible']")));
        // Удали контент
        driver.findElement(By.xpath(".//button[@class='card__delete-button card__delete-button_visible']")).click();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();    }
}