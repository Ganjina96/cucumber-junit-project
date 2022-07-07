package com.cydeo.step_definitions;

import com.cydeo.pages.AllOrdersPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebAppLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDef {

    WebAppLoginPage webAppLoginPage = new WebAppLoginPage();
    BasePage basePage = new BasePage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    AllOrdersPage allOrdersPage = new AllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webAppLoginPage.login("Test", "Tester");
        basePage.orderBtn.click();
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String productType) {
        Select select = new Select(webTableOrderPage.product);
        select.selectByVisibleText(productType);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {
        webTableOrderPage.quantity.clear();
        webTableOrderPage.quantity.sendKeys(String.valueOf(quantity));

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        webTableOrderPage.customerName.sendKeys(customerName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.street.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.city.sendKeys(city);

    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderPage.state.sendKeys(state);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        webTableOrderPage.zipCode.sendKeys(zip);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        List<WebElement> cardTypes = webTableOrderPage.creditCardType;

        for( WebElement eachCard : cardTypes){
            if (eachCard.getAttribute("value").equals(expectedCardType)){
                eachCard.click();
                break;
            }
        }

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNum) {
        webTableOrderPage.creditCardNum.sendKeys(cardNum);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
        webTableOrderPage.expiry.sendKeys(expDate);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.submitBtn.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String name) {
        basePage.viewAllOrders.click();
        Assert.assertEquals(name,allOrdersPage.firstName.getText());


    }


}
