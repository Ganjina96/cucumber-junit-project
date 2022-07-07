package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement inputUser;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement inputPass;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy (linkText = "Order")
    public WebElement orderBtn;

    @FindBy (id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropdown;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement name;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiryDate;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement submitBtn;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersButton;

    @FindBy(xpath = "(//table[@class='SampleTable']//td)[2]")
    public WebElement expectedRes;


    public void login(String username, String password){
        inputUser.sendKeys(ConfigurationReader.getProperty(username));
        inputPass.sendKeys(ConfigurationReader.getProperty(password));
        loginBtn.click();






    }




}
