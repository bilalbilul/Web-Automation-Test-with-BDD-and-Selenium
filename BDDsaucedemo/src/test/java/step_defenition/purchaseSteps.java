package step_defenition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.example.PageObject.LandingPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class purchaseSteps {

    private WebDriver webDriver;

    public purchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing Page")
    public void verifyLandingPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(LandingPage.verifyLandingPage());
        Thread.sleep(3000);
    }

    @Then("User sort product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException{
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.sortProduct(sort);
        Thread.sleep(3000);
    }

    @And("User choice 2 product from the list")
    public void choiceProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBasket1();
        landingPage.clickBasket2();
        Thread.sleep(3000);
    }

    @And("User remove 1 product from the list")
    public void removeProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickRemoveItem();
        Thread.sleep(3000);
    }

    @And("User click button Chart")
    public void btnChart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBtnChart();
        Thread.sleep(3000);
    }

    @And("User click Continue Shopping")
    public void btnContinueShopping() throws InterruptedException{
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickContinueShop();
        Thread.sleep(3000);
    }

    @And("User click Button Checkout")
    public void btnCheckout() throws InterruptedException{
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBtnCheckout();
        Thread.sleep(3000);
    }

}
