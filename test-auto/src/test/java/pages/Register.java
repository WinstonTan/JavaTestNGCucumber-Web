package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

    public Register(){}

    private By registerHyperlink = By.linkText("Register");
    private By fnameTxtfield = By.name("customer.firstName");
    private By lnameTxtfield = By.name("customer.lastName");
    private By addressTxtfield = By.name("customer.address.street");
    private By cityTxtfield = By.name("customer.address.city");
    private By stateTxtfield = By.name("customer.address.state");
    private By zipcodeTxtfield = By.name("customer.address.zipCode");
    private By phoneTxtfield = By.name("customer.phoneNumber");
    private By ssnTxtfield = By.name("customer.ssn");
    private By unameTxtfield = By.name("customer.username");
    private By passwordTxtfield = By.name("customer.password");
    private By confirmTxtfield = By.name("repeatedPassword");
    private By registerBtn = By.xpath("//input[@value='Register']");

    public void clickRegisterHypertext(WebDriver driver)
    {
        driver.findElement(registerHyperlink).click();
    }

    public void fillRegistrationForm(WebDriver driver, String fName, String lName, String address, String city,
                                     String state, String zipcode, String phone, String ssn, String uname,
                                     String password, String confirm)
    {
        driver.findElement(fnameTxtfield).sendKeys(fName);
        driver.findElement(lnameTxtfield).sendKeys(lName);
        driver.findElement(addressTxtfield).sendKeys(address);
        driver.findElement(cityTxtfield).sendKeys(city);
        driver.findElement(stateTxtfield).sendKeys(state);
        driver.findElement(zipcodeTxtfield).sendKeys(zipcode);
        driver.findElement(phoneTxtfield).sendKeys(phone);
        driver.findElement(ssnTxtfield).sendKeys(ssn);
        driver.findElement(unameTxtfield).sendKeys(uname);
        driver.findElement(passwordTxtfield).sendKeys(password);
        driver.findElement(confirmTxtfield).sendKeys(confirm);
    }

    public void submitRegistration(WebDriver driver)
    {
        driver.findElement(registerBtn).click();
    }

}
