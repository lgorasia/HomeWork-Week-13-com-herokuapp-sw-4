package com.herokuapp.internet.the.pages;


import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class SigninPage extends Utility {
    By usernameField = By.xpath("//input[@id='username']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.tagName("i");
    By invalidUserNamefield = By.id("flash");
    By invalidPasswordField =By.xpath("//div[@id='flash']");


    public void enterUsername(String userName) {

        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void cliclOnLoginButton() {

        clickOnElement(loginButton);
    }
    public String invalidusernameDisplayedText(){
        return getTextFromElement(invalidUserNamefield);
    }
    public String invalidPasswordDisplayText(){
        return getTextFromElement(invalidPasswordField);
    }



}
