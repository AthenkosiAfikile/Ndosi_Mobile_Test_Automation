package Screens;

import Utilities.AppiumDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeaningMaterialScreen {
    WebDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"login-heading\"]")
    WebElement learningMaterialHeading;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"login-email\"]")
    WebElement emailInputField;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"login-password\"]")
    WebElement passwordInputField;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"login-submit\"]")
    WebElement loginButton;

    @FindBy(id = "com.android.chrome:id/message_paragraph_1")
    WebElement applicationPopUp;

    public LeaningMaterialScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyLearningMaterialScreenDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(learningMaterialHeading));
        learningMaterialHeading.isDisplayed();
    }
    public void clickOnEmailInputField() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.click();
    }
    public void enterEmail(String arg0) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(arg0);
    }
    public void clickOnPasswordInputField() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.click();
    }
    public void enterPassword(String arg0) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(arg0);
        learningMaterialHeading.click();
    }
    public void clickOnLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
    public void applicationDashboardIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(applicationPopUp));
        applicationPopUp.isDisplayed();
    }
    public void acceptLoginFailedPopup() {
        try {
            WebDriverWait wait = new WebDriverWait(AppiumDriverFactory.getDriver(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = AppiumDriverFactory.getDriver().switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();
            System.out.println("Popup accepted successfully.");
        } catch (NoAlertPresentException | TimeoutException e) {
            System.out.println("No login failed popup was displayed. Assuming successful login.");
        }
    }
}
