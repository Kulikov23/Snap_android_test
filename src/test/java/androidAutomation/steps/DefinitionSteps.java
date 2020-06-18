package androidAutomation.steps;

import androidAutomation.steps.serenity.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;


    @When("^Click on the Login button$")
    public void clickOnTheLoginButton() throws Throwable {
        steps.clickOnTheLoginButton();
    }

    @When("^Type email to the email field$")
    public void typeEmailToTheEmailField() throws Throwable {
        steps.typeEmailToTheEmailField();
    }

    @When("^Type password to the password field$")
    public void typeToThePasswordField() throws Throwable {
        steps.typePasswordToThePasswordField();
    }

    @When("^Click on the Sign in button$")
    public void clickOnTheSignInButton() throws Throwable {
        steps.clickOnTheSignInButton();
    }

    @When("^Click on Friends button$")
    public void clickOnFriendsButton() throws Throwable {
        steps.clickOnFriendsButton();
    }

    @When("^Click on the new chat button$")
    public void clickOnTheNewChatButton() throws Throwable {
        steps.clickOnTheNewChatButton();
    }


    @When("^Enter text message$")
    public void enterTextMessage() throws Throwable {
        steps.enterTextMessage();
    }

    @When("^Enter the \"([^\"]*)\" receiver$")
    public void enterTheReceiver(String arg0) throws Throwable {
        steps.enterTheReceiver(arg0);
    }

    @When("^Click on the chat button$")
    public void clickOnTheChatButton() throws Throwable {
        steps.clickOnTheChatButton();
    }

    @When("^Click send button$")
    public void clickSendButton() throws Throwable {
        steps.clickSendButton();
    }
}
