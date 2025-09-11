package StepDef;

import Utilities.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class Hooks {

    protected static AndroidDriver driver;

    public Hooks(){
        driver = AppiumDriverFactory.getDriver();
    }

    public void takeScreenshotOnFailure(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }
}
