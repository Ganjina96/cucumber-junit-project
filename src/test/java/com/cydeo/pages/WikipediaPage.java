package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "searchInput")
    public WebElement searchBox;

    @FindBy (css = ".sprite.svg-search-icon")
    public WebElement searchBtn;

    @FindBy (id = "firstHeading")
    public WebElement header;

    @FindBy (css = ".fn")
    public WebElement imageHeader;
}
