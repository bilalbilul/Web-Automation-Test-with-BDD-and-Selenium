package step_defenition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.PageObject.CheckoutPage;
import org.example.PageObject.LandingPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;
    public CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on Checkout Page")
    public void verifyCheckoutPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        LandingPage landingPage = new LandingPage(webDriver);
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(CheckoutPage.vrfyCheckoutPage());
        Thread.sleep(3000);
    }

    @Then("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as zipCode")
    public void inputForm(String first, String last, String zipCode) throws InterruptedException{
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.setFirstName(first);
        checkoutPage.setLastName(last);
        checkoutPage.setPostalCode(zipCode);
        Thread.sleep(3000);
    }

    @And("User click button Continue")
    public void btnConti() throws InterruptedException{
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickBtnConti();
        Thread.sleep(3000);
    }

    @Then("User already on Overview Page")
    public void verifyOverview() throws InterruptedException{
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.verifTotalAmount();
        Thread.sleep(3000);
    }

    @And("User click button Finish")
    public void buttonFinish() throws InterruptedException{
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickBtnFinis();
        Thread.sleep(3000);
    }

}
