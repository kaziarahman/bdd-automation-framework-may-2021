package com.pnt.stepDef;

import com.pnt.base.TestBase;
import com.pnt.pages.AmazonHomepage;
import com.pnt.pages.AmazonSearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageFunctionality {

    private AmazonHomepage amazonHomepage;
    private AmazonSearchResultPage amazonSearchResultPage;

    @Given("^user opens the browser and navigate to amazon\\.com and setup the POM$")
    public void user_opens_the_browser_and_navigate_to_amazon_com_and_setup_the_POM() {
        TestBase.setupDriver();
        TestBase.driver.get("https://www.amazon.com");

        amazonHomepage = PageFactory.initElements(TestBase.driver, AmazonHomepage.class);

    }

    @When("^user can see the search bar$")
    public void user_can_see_the_search_bar() {
        amazonHomepage.validateSearBarIsDisplayed();
    }

    @Then("^user types Java Books in the searchh bar$")
    public void user_types_Java_Books_in_the_search_bar() {
        amazonHomepage.typeInSearchBar("Java Books");
    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_search_button() {
        amazonHomepage.clickOnSearchButton();
    }

    @Then("^user can see search result of Java Books$")
    public void user_can_see_search_result_of_Java_Books() {
        amazonSearchResultPage = PageFactory.initElements(TestBase.driver, AmazonSearchResultPage.class);

        amazonSearchResultPage.validateSearchedItemIsDisplayed();
    }

    @Then("^user closes the browser$")
    public void user_closes_the_browser() {
        TestBase.driver.quit();
    }


    @Then("^user types (.*) in the search bar$")
    public void user_types_bookNames_in_the_search_bar(String bookName) {
        amazonHomepage.typeInSearchBar(bookName);
    }
}
