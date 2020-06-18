package androidAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class MyAndroidDriver implements DriverSource {

    public static AndroidDriver driver;
    public static Dimension screenDimensions;
    public static String userName = "vladimirkulikov1";
    public static String accessKey = "YypHSyiDgCHp6PhaHVgx";
    @Override
    public AndroidDriver newDriver() {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My First Build");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("app", "bs://cbec868841ae493eb4799b30e98696bf2962b092");

        AndroidDriver<AndroidElement> driver = null;
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }

    public static AndroidElement getElementById(String id) throws Exception {
        return (AndroidElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + id + "\").instance(0);");
    }

    public static AndroidElement getElementByClassName(String className) throws Exception {

        return (AndroidElement) driver.findElementByAndroidUIAutomator("new UiSelector().className(\"" + className + "\").instance(0);");
    }
}