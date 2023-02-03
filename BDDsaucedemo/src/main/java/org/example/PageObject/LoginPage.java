package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement vrfyLandingPage;

    @FindBy(xpath = "//h3")
    private WebElement errorText;


    public void setUsername(String user){
        userName.sendKeys(user);
    }

    public void setPassword(String password){
        Password.sendKeys(password);
    }

    public void setBtnlogin(){
        buttonLogin.click();
    }

    public boolean verifyLoginPage(){
        userName.isDisplayed();
        return true;
    }

    public String verifyErrorTeks(){
        return errorText.getText();
    }

}
