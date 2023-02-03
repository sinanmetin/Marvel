package com.marvel.step_def;

import com.marvel.pages.BasePage;
import com.marvel.pages.HomePage;
import com.marvel.pages.SearchPage;
import com.marvel.testBase.TestBase;
import com.marvel.utilities.BrowserUtils;
import com.marvel.utilities.ConfigurationReader;
import com.marvel.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search extends TestBase {




    @Given("The user is on home page")
    public void the_user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
        BrowserUtils.waitForPageToLoad(10);
    }

    @When("the user navigate to search page")
    public void the_user_navigate_to_search_page() {
        homePage.searchBtn.click();
    }

    @When("the user select COMICS section")
    public void the_user_select_comics_section() {
        searchPage.comics.click();
    }

    @When("the user enter Avengers in search field")
    public void the_user_enter_avengers_in_search_field() {
    searchPage.searchField.sendKeys("Avengers"+ Keys.ENTER);
    }

    @Then("the user expected that {int} result on page")
    public void the_user_expected_that_result_on_page(int resultNumber) {
        List<WebElement> searchList = Driver.getDriver().findElements(By.xpath("//div[@class='mvl-card mvl-card--search']"));
        Assert.assertEquals(searchList.size(),resultNumber);

    }

    @Then("the user expected that {string} page of result")
    public void the_user_expected_that_page_of_result(String numberOfPage) {

        String text = Driver.getDriver().findElement(By.xpath("//span[@aria-label='Page "+numberOfPage+"']")).getAttribute("aria-label");
        Assert.assertEquals("Page "+numberOfPage,text);

    }


}
