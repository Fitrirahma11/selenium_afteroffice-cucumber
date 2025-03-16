package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstrakomponen.Abstractcomponen;

public class LoginPage extends Abstractcomponen{


    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
      }


 @FindBy(id = "user-name")
 public WebElement userName;

 @FindBy(id = "password")
 public  WebElement userPassword;

 @FindBy(id = "login-button")
 public  WebElement loginButton;

 By usernameBy = By.id("user-name");
 
 public void loginApplication(String username, String password) 
{
    visibilityOfElementLocated(usernameBy);
     userName.sendKeys(username);
     userPassword.sendKeys(password);
     loginButton.click();
 }

 public void clickLoginButton() {
     loginButton.click();
 }

    public WebDriver getDriver() {
        return driver;
    }

}



