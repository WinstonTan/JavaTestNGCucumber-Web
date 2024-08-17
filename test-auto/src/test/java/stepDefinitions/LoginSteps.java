package stepDefinitions;

import driverFactory.WebDriverHolder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.Overview;

import static org.testng.Assert.assertEquals;

public class LoginSteps extends BaseSteps{

//    WebDriver driver ;
WebDriver driver = WebDriverHolder.getDriver();
    Home home;
    Overview overview;

    public LoginSteps()
    {
    }

//    @Before
//    public void setup()
//    {
//        System.out.println("Test 00000000 000000");
//        driver = driverFactory.initBrowser();
//    }
//
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }
//
    @Override
    @Given("^I am on the home page$")
    public void i_am_on_the_home_page()
    {
//        WebDriver driver = WebDriverHolder.getDriver();
        home = new Home();
        home.openHomePage(driver);
        driver.manage().window().maximize();

    }

    @And("^I click on Sign in link text$")
    public void i_click_on_sign_in_link_text() {
//        WebDriver driver = WebDriverHolder.getDriver();
        home.EnterUsername(driver, "autobot1");

    }
    @When("^I enter valid username and password$")
    public void i_enter_valid_username_and_password() {
//        WebDriver driver = WebDriverHolder.getDriver();
        home.EnterPassword(driver,"Abcd1234");

    }
    @When("^I click on the login button$")
    public void i_click_on_the_login_button() {
//        WebDriver driver = WebDriverHolder.getDriver();
        home.clickLoginBtn(driver);

    }
    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        overview = new Overview();
        assertEquals("Accounts Overview", overview.getPageTitle(driver));
    }

}
