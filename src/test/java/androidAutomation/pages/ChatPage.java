package androidAutomation.pages;

import androidAutomation.ILocators;
import androidAutomation.MyAndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import static androidAutomation.MyAndroidDriver.getElementById;
import static androidAutomation.pages.JsonParse.description;
import static androidAutomation.pages.JsonParse.email;

public class ChatPage extends PageObject {

    public void enterTheReceiver(String arg0) throws Exception {
        getElementById(ILocators.Receiver).sendKeys(arg0);
        MyAndroidDriver.driver.pressKeyCode(66);
    }
    public void clickOnTheChatButton() throws Exception {
        getElementById(ILocators.start_chat).tap(1, 1);
    }

    public void enterTextMessage() throws Exception {
        JsonParse.parseJson();
        getElementById(ILocators.input_field).sendKeys("This is an info about random user from (https://randomuser.me/api/) resource:" +"\n"+
                "User email: " + email + "\n" + "Description: " + description+ "\n");
    }

    public void clickSendButton() throws Exception{
        getElementById("com.snapchat.android:id/name").tap(1,1);
    }
}
