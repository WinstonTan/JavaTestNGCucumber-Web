package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    public Home() {}

    private By UsernameTxtField = By.name("username");
    private By PasswordTxtField = By.name("password");
    private By LoginBtn = By.xpath("//input[@value='Log In']");

    //https://www.youtube.com/watch?v=UAL4bDEuwzA&list=PLAkEcrdilZ4nhGjwZTSHYV3Xo6xuIckzk&index=4

    public void EnterUsername(WebDriver driver, String username)
    {
        driver.findElement(UsernameTxtField).sendKeys(username);
    }

    public void EnterPassword(WebDriver driver, String password)
    {
        driver.findElement(PasswordTxtField).sendKeys(password);
    }

    public void clickLoginBtn(WebDriver driver)
    {
        driver.findElement(LoginBtn).click();
    }

    public void openHomePage(WebDriver driver)
    {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
}
