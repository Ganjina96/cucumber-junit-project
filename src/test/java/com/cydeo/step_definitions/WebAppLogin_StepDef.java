package com.cydeo.step_definitions;

import com.cydeo.pages.WebAppLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebAppLogin_StepDef {

    WebAppLoginPage webAppLoginPage = new WebAppLoginPage();


    @Given("user is on the web table login page")
    public void user_is_on_the_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webAppLoginPage.inputUsername.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webAppLoginPage.inputPassword.sendKeys(password);


    }

    @And("user click login button")
    public void userClickLoginButton() {
        webAppLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String user, String pass) {
        webAppLoginPage.login(user,pass);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        webAppLoginPage.login(credentials.get("username"), credentials.get("password"));

    }


}
