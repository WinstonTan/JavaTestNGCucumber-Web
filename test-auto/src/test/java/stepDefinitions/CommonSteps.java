package stepDefinitions;

import driverFactory.WebDriverHolder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CommonSteps extends WebDriverHolder {

    WebDriver driver;

    @Before
    public void setup()
    {
        System.out.println("Setting up test...");
        driver = WebDriverHolder.getDriver();
    }

    @After
    public void tearDown()
    {
        System.out.println("Tearing down test...");
        driver.quit();
    }

}
