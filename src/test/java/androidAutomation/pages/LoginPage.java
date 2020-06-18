package androidAutomation.pages;

import androidAutomation.ILocators;
import net.serenitybdd.core.pages.PageObject;
import static androidAutomation.MyAndroidDriver.getElementById;
import static androidAutomation.pages.JsonParse.login;
import static androidAutomation.pages.JsonParse.password;

public class LoginPage extends PageObject {

    public void typeEmailToTheEmailField() throws Exception {
        JsonParse.parseCredentials();
        getElementById(ILocators.username_field).sendKeys(login);
    }

    public void typePasswordToThePasswordField() throws Exception {
        JsonParse.parseCredentials();
        getElementById(ILocators.password_field).sendKeys(password);
    }

    public void clickOnTheSignInButton() throws Exception {
        getElementById(ILocators.loginButton2).tap(1, 1);
        waitABit(20000);
    }

    public void clickOnTheLoginButton() throws Exception {
        getElementById(ILocators.loginButton).tap(1, 1);

    }
}
