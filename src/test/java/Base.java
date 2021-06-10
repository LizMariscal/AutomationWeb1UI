import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
    public WebDriver webDriver;

    @BeforeMethod
       public void basePage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/login");
        //webDriver.findElement(By.linkText("/login")).click();
        webDriver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown() {
        if (webDriver != null)
            webDriver.quit();
    }

}
