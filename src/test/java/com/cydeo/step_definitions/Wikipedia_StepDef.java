package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiki.URL"));

    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name) {
        wikipediaPage.searchBox.sendKeys(name);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchBtn.click();

    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String name) {

        Assert.assertEquals(name,wikipediaPage.header.getText());


    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String name) {

        Assert.assertEquals(name,wikipediaPage.imageHeader.getText());

    }
}
