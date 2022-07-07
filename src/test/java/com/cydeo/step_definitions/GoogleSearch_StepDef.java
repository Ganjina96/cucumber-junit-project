package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


import java.util.List;

public class GoogleSearch_StepDef {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for a {string} capital")
    public void user_searches_for_capital(String countryName) {
        googleSearchPage.searchBox.sendKeys("what is capital of " + countryName + Keys.ENTER);

    }

    @Then("user should see {string} in the result")
    public void user_should_see_in_the_result(String capital) {
        String header = googleSearchPage.pageHeader.getText();
        Assert.assertEquals(capital,header);


    }

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");

    }
    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }
    @Then("user sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals("apple - Google Search", Driver.getDriver().getTitle());



    }

    @When("user types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }

    @Then("user sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

        //TODO: you need to fix this later

    }

    @Then("User should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeywords) {
        System.out.println("searchKeywords = " + searchKeywords);

        for (String eachKeyword : searchKeywords){
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(eachKeyword + Keys.ENTER);
            Assert.assertEquals(eachKeyword+" - Google Search", Driver.getDriver().getTitle());
        }

    }


}
