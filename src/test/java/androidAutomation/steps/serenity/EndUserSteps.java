package androidAutomation.steps.serenity;

import androidAutomation.MyAndroidDriver;
import androidAutomation.pages.ChatPage;
import androidAutomation.pages.FriendsPage;
import androidAutomation.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static androidAutomation.MyAndroidDriver.*;


public class EndUserSteps extends ScenarioSteps {
    LoginPage loginPage;
    FriendsPage friendsPage;
    ChatPage chatPage;

    @Step
    public void clickOnTheLoginButton() throws Exception {
        loginPage.clickOnTheLoginButton();
    }

    @Step
    public void typeEmailToTheEmailField() throws Exception {
        loginPage.typeEmailToTheEmailField();
    }

    @Step
    public void typePasswordToThePasswordField() throws Exception {
        loginPage.typePasswordToThePasswordField();
    }

    @Step
    public void clickOnTheSignInButton() throws Exception {
        loginPage.clickOnTheSignInButton();
    }

    @Step
    public void clickOnFriendsButton() throws Exception {
        friendsPage.clickOnFriendsButton();
    }

    @Step
    public void clickOnTheNewChatButton() throws Exception {
        friendsPage.clickOnTheNewChatButton();
    }

    @Step
    public void enterTextMessage() throws Exception {
        chatPage.enterTextMessage();
    }

    @Step
    public void enterTheReceiver(String arg0) throws Exception {
        chatPage.enterTheReceiver(arg0);
    }

    @Step
    public void clickOnTheChatButton() throws Exception {
        chatPage.clickOnTheChatButton();
    }

    @Step
    public void clickSendButton() throws Exception {
        chatPage.clickSendButton();
    }
}