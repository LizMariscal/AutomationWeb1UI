import Task.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin extends Base{

    @Test
    public void testLogin(){
        Login.as(webDriver, "Liz","admin123");
    }
}
