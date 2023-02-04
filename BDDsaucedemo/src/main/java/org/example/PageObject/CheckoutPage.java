package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver driver;
    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private static WebElement vrfyCheckoutPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private static WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private static WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private static WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private static WebElement btnConti;

    @FindBy(xpath = "//h3")
    private WebElement formError;

    @FindBy(xpath = "//div[@class='summary_info']/div[7]")
    private WebElement verifTotal;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinis;

    public static boolean vrfyCheckoutPage() {
        vrfyCheckoutPage.isDisplayed();
        return true;
    }

    public void setFirstName(String first){
        firstName.sendKeys(first);
    }

    public void setLastName(String last){
        lastName.sendKeys(last);
    }

    public void setPostalCode(String zipCode){
        postalCode.sendKeys(zipCode);
    }

    public void clickBtnConti(){
        btnConti.click();
    }

    public boolean verifyCheckoutPage(){
        firstName.isDisplayed();
        return true;
    }

    public String verifyErrorForm(){
        return formError.getText();
    }

    public boolean verifTotalAmount(){
        verifTotal.isDisplayed();
        return true;
    }

    public void clickBtnFinis(){
        btnFinis.click();
    }

}
