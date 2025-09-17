package Screens;

import Locators.Roots_Elements;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomeScreen extends Roots_Elements {
    private final AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Learn Automation the Right Way\"]")
    WebElement headingLearnAutomation;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"nav-burger\"]")
    WebElement buttonOpenMenu;

    @FindBy(xpath = "//android.widget.ToggleButton[@text='Learning Materials']")
    WebElement headingLoginToAccessLearningMaterials;

    public HomeScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyHeadingLearnAutomationDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(headingLearnAutomation));
        headingLearnAutomation.isDisplayed();
    }

    public void clickOnOpenMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(buttonOpenMenu));
        buttonOpenMenu.click();
    }

    public void clickOnLearningMaterialTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(headingLoginToAccessLearningMaterials));
        headingLoginToAccessLearningMaterials.click();
    }
}




