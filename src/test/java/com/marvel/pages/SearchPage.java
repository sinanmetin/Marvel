package com.marvel.pages;

import com.marvel.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class SearchPage extends BasePage {



    @FindBy (xpath = "//a[.='comics']")
    public WebElement comics;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchField;





}
