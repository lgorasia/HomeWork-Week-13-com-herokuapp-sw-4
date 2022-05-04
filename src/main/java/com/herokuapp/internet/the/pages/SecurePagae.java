package com.herokuapp.internet.the.pages;



import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class SecurePagae extends Utility {

    By secureAreaField = By.tagName("h2");


    public String secureAreaText(){
       return getTextFromElement(secureAreaField);
    }

    }


