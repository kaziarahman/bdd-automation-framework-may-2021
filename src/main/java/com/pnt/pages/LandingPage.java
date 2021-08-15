package com.pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginButton;

    public void fillEmailField(String data) {
        emailField.sendKeys(data);
    }

    public void fillPassField(String data) {
        passwordField.sendKeys(data);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
