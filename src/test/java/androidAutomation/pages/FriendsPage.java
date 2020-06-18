package androidAutomation.pages;

import androidAutomation.ILocators;
import androidAutomation.MyAndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import static androidAutomation.MyAndroidDriver.getElementById;

public class FriendsPage extends PageObject {

    public void clickOnFriendsButton() throws Exception {
        MyAndroidDriver.getElementById(ILocators.Allow_permisiions_main).tap(1,1);
        for (int i =0; i<3;i++){
            getElementById(ILocators.Allow_permissions).tap(1,1);
        }
        getElementById(ILocators.friends_button).tap(1, 1);
    }

    public void clickOnTheNewChatButton() throws Exception {
            getElementById(ILocators.new_chat_button).tap(1, 1);
    }
}
