package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Overview {

    private By pageTitle = By.className("title");

//    public String getPageTitle(WebDriver driver, String expectedPageTitle)
    public String getPageTitle(WebDriver driver)
    {
        return driver.findElement(pageTitle).getText();
    }
}
