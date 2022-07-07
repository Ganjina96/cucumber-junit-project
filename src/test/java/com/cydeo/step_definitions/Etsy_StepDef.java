package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDef {

    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on Etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.URL"));
    }

    @Then("User sees title {string}")
    public void user_sees_title(String expectedTitle) {

        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }


    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");

    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchBtn.click();

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));

    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String name) {
        etsyPage.searchBox.sendKeys(name);
    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


}
