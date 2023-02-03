package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private static WebElement verifyLandingPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basket1;
    public void clickBasket1(){
        basket1.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket2;
    public void clickBasket2(){
        basket2.click();
    }

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement buttonChart;
    public void clickBtnChart(){
        buttonChart.click();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem;
    public void clickRemoveItem(){
        removeItem.click();
    }

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement buttonContinueShopping;
    public void clickContinueShop(){
        buttonContinueShopping.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;
    public void clickBtnCheckout(){
        buttonCheckout.click();
    }

    public void sortProduct(String sort){
        Select a = new Select(selectContainer);
        a.selectByVisibleText(sort);
    }

    public static boolean verifyLandingPage(){
        verifyLandingPage.isDisplayed();
        return true;
    }

}
