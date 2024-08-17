package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Reporter;

public class WebDriverHolder {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

//    public WebDriver initBrowser()
     public void initBrowser()
    {
        String browserType = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browserType");
//        WebDriver driver;


        ChromeOptions options = new ChromeOptions();

        switch (browserType.toUpperCase()) {
            case "CHROME": default:
                System.out.println("Param: " + browserType);
//                driver = new ChromeDriver();
                driver.set(new ChromeDriver());
                break;
            case "CHROME_HEADLESS":
                System.out.println("Param: " + browserType);
                options.addArguments("--headless");
//                driver = new ChromeDriver(options);
                driver.set(new ChromeDriver(options));
                break;

        }
//        return driver;
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            // Initialize WebDriver
            driver.set(new ChromeDriver()); // Replace with desired driver
        }
        return driver.get();
    }

    public static void quitDriver() {
        WebDriver driver = WebDriverHolder.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }

}