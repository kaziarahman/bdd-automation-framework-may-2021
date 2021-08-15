package com.pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomepage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;


    public void validateSearBarIsDisplayed() {
        Assert.assertTrue(searchBar.isDisplayed());
    }

    public void typeInSearchBar(String data) {
        searchBar.sendKeys(data);
    }

    public void clickOnSearchButton() {
        searchBtn.click();
    }
}
