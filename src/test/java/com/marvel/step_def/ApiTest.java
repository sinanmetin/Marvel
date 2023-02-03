package com.marvel.step_def;

import com.marvel.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApiTest {

    Response response;



    @Given("I logged Marvel api using apikey and hash")
    public void i_logged_marvel_api_using_apikey_and_hash() {

        response=RestAssured.given().accept(ContentType.JSON)
                .and().queryParams("ts","1","apikey",ConfigurationReader.getProperty("apikey"),"hash",ConfigurationReader.getProperty("hash"))
                .when().get(ConfigurationReader.getProperty("base_URI")+"/comics");



    }
    @When("I get the current comics from api")
    public void i_get_the_current_comics_from_api() {



    }
    @Then("status code should be {int}")
    public void status_code_should_be(int int1) {

        Assert.assertEquals(int1,response.getStatusCode());


    }





}
