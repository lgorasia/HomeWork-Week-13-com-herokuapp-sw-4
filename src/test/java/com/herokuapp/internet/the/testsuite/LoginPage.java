package com.herokuapp.internet.the.testsuite;


import com.herokuapp.internet.the.pages.SecurePagae;
import com.herokuapp.internet.the.pages.SigninPage;
import com.herokuapp.internet.the.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
    SigninPage signinPage = new SigninPage();
    SecurePagae securePagae = new SecurePagae();



    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        signinPage.enterUsername("tomsmith");
        signinPage.enterPassword("SuperSecretPassword!");
        signinPage.cliclOnLoginButton();


       String actualMessage= securePagae.secureAreaText();
       String expectedMessage = "Secure Area";

        Assert.assertEquals(expectedMessage, actualMessage, "Secured Area not displayed");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        signinPage.enterUsername("tomsmith1");
        signinPage.enterPassword("SuperSecretPassword!");
        signinPage.cliclOnLoginButton();
        String actualText = signinPage.invalidusernameDisplayedText();
        String expectedText = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(expectedText, actualText);
    }
        @Test
                public void verifyThePasswordErrorMessage(){
            signinPage.enterUsername("tomsmith");
            signinPage.enterPassword("SuperSecretPassword");
            signinPage.cliclOnLoginButton();
            String actualText = signinPage.invalidPasswordDisplayText();
            String expectedText = "Your password is invalid!\n"  +
                                   "×";
            Assert.assertEquals(expectedText,actualText);


        }



    }



