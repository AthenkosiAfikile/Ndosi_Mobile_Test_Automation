package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeaningMaterialScreen {
    WebDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text='Login to Access Learning Materials']")
    WebElement learningMaterialHeading;

    public LeaningMaterialScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyLearningMaterialScreenDisplayed(String expectedHeading) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(learningMaterialHeading));
        String actualHeading = learningMaterialHeading.getText();
        if (!actualHeading.equals(expectedHeading)) {
            throw new AssertionError("Expected heading: " + expectedHeading +
                    ", \nbut got: " + actualHeading);
        }

    }
}
