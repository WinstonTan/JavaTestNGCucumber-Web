package stepDefinitions;

import driverFactory.WebDriverHolder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import pages.Register;
import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RegisterSteps {

    Register register = new Register();

    @And("I click on Register link text")
    public void iClickOnRegisterLinkText() {
        WebDriver driver = WebDriverHolder.getDriver();
        register.clickRegisterHypertext(driver);

    }

    @When("I inserts user data from {string} and rowNumber {string}")
    public void iInsertsUserDataFromAndRowNumber(String sheetName, String rowNumber) throws IOException, InvalidFormatException {
        ExcelReader excelReader = new ExcelReader();
        List<Map<String, String>> data =
                excelReader.getData(System.getProperty("user.dir") +"/data/testdata.xlsx", sheetName);

        int intRowNum = Integer.parseInt(rowNumber);

        String fName = data.get(intRowNum).get("fName");
        String lName = data.get(intRowNum).get("lName");
        String address = data.get(intRowNum).get("address");
        String city = data.get(intRowNum).get("city");
        String state = data.get(intRowNum).get("state");
        String zipcode = data.get(intRowNum).get("zipcode");
        String phone = data.get(intRowNum).get("phone");
        String ssn = data.get(intRowNum).get("ssn");
        String uname = data.get(intRowNum).get("uname");
        String password = data.get(intRowNum).get("password");
        String confirm = data.get(intRowNum).get("confirm");

        WebDriver driver = WebDriverHolder.getDriver();
        register.fillRegistrationForm(
                driver, fName, lName, address, city, state, zipcode, phone, ssn,
                uname, password, confirm);
    }

    @And("I click on the Register button")
    public void iClickOnTheRegisterButton() {
        WebDriver driver = WebDriverHolder.getDriver();
        register.submitRegistration(driver);
    }

    @Then("user record is registered successfully")
    public void userRecordIsRegisteredSuccessfully() {
        WebDriver driver = WebDriverHolder.getDriver();

    }
}
