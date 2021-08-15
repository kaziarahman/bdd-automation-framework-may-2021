package com.pnt.stepDef;

import com.pnt.base.TestBase;
import com.pnt.pages.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LandingPageFunctionality {


    private LandingPage landingPage;

    @Given("^user opens the browser and navigate to facebook\\.com$")
    public void user_opens_the_browser_and_navigate_to_facebook_com() {
        TestBase.setupDriver();
        TestBase.driver.get("https://www.facebook.com");
    }

    @When("^user fills username field$")
    public void user_fills_username_field() {
        landingPage = PageFactory.initElements(TestBase.driver, LandingPage.class);
        landingPage.fillEmailField("Test data");
    }

    @Then("^user fills password field$")
    public void user_fills_password_field() {
        landingPage.fillPassField("data");
    }

    @Then("^user clicks on sign in button$")
    public void user_clicks_on_sign_in_button() {
        landingPage.clickOnLoginButton();
    }

    @Then("^user is logged in successfully$")
    public void user_is_logged_in_successfully() {

    }


}
