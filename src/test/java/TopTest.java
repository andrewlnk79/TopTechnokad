import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);

    }

    @Test
    public void loginErrorTest(){
        driver.get("https://top.technokad.ru");
        new LoginPage(driver).login("admin", "admin");
        Assertions.assertTrue(loginPage.getLoginError().isDisplayed());
    }
    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
