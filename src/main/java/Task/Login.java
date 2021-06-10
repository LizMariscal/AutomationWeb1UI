package Task;

import Action.Click;
import Action.Enter;
import UI.LoginUI;
import org.openqa.selenium.WebDriver;

public class Login {
    public static void as(WebDriver driver, String username, String passWord){
        Enter.text(driver, LoginUI.userInput, username);
        Enter.text(driver, LoginUI.passWordInput, passWord);
        Click.on(driver, LoginUI.login);
    }

}
