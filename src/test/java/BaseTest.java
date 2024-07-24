import io.github.bonigarcia.wdm.WebDriverManager;

import org.example.BasePage;
import org.example.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected MainPage mainPage;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void close(){
        driver.quit();
    }
}
