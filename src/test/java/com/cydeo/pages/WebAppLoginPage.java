package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebAppLoginPage {

    public WebAppLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "username")
    public WebElement inputUsername;

    @FindBy (name = "password")
    public WebElement inputPassword;

    @FindBy (css = ".btn.btn-primary.login__submit")
    public WebElement loginBtn;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }

}


