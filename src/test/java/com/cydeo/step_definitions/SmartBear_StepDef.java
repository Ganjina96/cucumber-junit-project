package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smart.bear.URL"));
        smartBearPage.login("smart.bear.user","smart.bear.pass");
        smartBearPage.orderBtn.click();


    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select = new Select(smartBearPage.dropdown);
        select.selectByVisibleText("FamilyAlbum");

    }
    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(int quantity) {
        smartBearPage.quantity.clear();
        smartBearPage.quantity.sendKeys(quantity+"");

    }
    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String name) {
        smartBearPage.name.sendKeys(name);

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearPage.street.sendKeys(street);

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearPage.city.sendKeys(city);

    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearPage.state.sendKeys(state);

    }
    @When("User enters {string}")
    public void user_enters(String zip) {
        smartBearPage.zipCode.sendKeys(zip);

    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.cardType.click();

    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNum) {
        smartBearPage.cardNumber.sendKeys(cardNum);

    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String exp) {
        smartBearPage.expiryDate.sendKeys(exp);

    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.submitBtn.click();

    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        smartBearPage.viewAllOrdersButton.click();

        Assert.assertEquals(expectedName,smartBearPage.expectedRes.getText());


    }


    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        Select select = new Select(smartBearPage.dropdown);
        select.selectByVisibleText(product);
    }

    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBearPage.quantity.clear();
        smartBearPage.quantity.sendKeys(quantity);
    }



    @When("User enters {string} to zip")
    public void userEntersToZip(String zip) {
        smartBearPage.zipCode.sendKeys(zip);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String cardType) {
        smartBearPage.cardType.click();
    }
}
