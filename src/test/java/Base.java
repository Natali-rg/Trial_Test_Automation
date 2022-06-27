import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    static ChromeDriver driver;

    @BeforeClass
    public static void initChrome() {
        System.setProperty("webdriver.chrome.driver", "D:/Natali/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void close() throws InterruptedException {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
