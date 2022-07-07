package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablesPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Data_Tables_StepDef {


    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice"));

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
        Select select = new Select(dataTablesPage.dropDown);
        List<WebElement> allOptions = select.getOptions();

        for (WebElement each : allOptions) {
            Assert.assertTrue(months.contains(each.getText()));
        }


    }

    }


