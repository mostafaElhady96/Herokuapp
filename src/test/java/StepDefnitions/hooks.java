package StepDefnitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class hooks {
    public static WebDriver driver;

    @Before
    public void openBrwoser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @After
    public void CloseBrwoser() throws InterruptedException {
       Thread.sleep(1000);
        driver.quit();

    }
}
