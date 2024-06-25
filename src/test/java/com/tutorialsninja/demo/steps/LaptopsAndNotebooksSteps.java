package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LaptopsAndNotebooksSteps {
    @Then("I will see the Product arrange in High to Low order")
    public void iWillSeeTheProductArrangeInHighToLowOrder() {
        //1.4 Verify the Product price will arrange in High to Low order.
        List<Double> expectedList = new LaptopAndNotebookPage().priceHighToLow();
        List<Double> actualList = new LaptopAndNotebookPage().getPriceHighToLow();
        Assert.assertEquals(actualList, expectedList);
    }

    @When("I mouse hover and click on currency dropdown")
    public void iMouseHoverAndClickOnCurrencyDropdown() {
        new HomePage().clickOnElement(new DesktopPage().currencyDropdown);
    }

    @And("I mouse hover and click on  £ Pound Sterling")
    public void iMouseHoverAndClickOn£PoundSterling() {
        new HomePage().clickOnElement(new DesktopPage().poundSterling);
    }

    @And("I Mouse hover on Laptops & Notebooks Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I call select Menu method and pass menu Show All Laptops & Notebooks")
    public void iCallSelectMenuMethodAndPassMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @When("I mouse hover and click on laptop and notebook tab")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        //2.3 Mouse hover on Desktops Tab.
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I select menu {string}")
    public void iSelectMenu(String menu) {
        // 2.4 Click on “Show All Desktops”
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String order) {
        new DesktopPage().sortByProducts(order);
    }

    @And("I select product {string} from laptop and notebook page")
    public void iSelectProductFromLaptopAndNotebookPage(String product) {
        new DesktopPage().clickOnProduct(product);

    }

    @And("I should navigate to {string} product")
    public void iShouldNavigateToProduct(String product) {
        Assert.assertEquals(new ProductPage().getProductText(), product);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("I should see the message Success: You have added {string} to your shopping cart!")
    public void iShouldSeeTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        Assert.assertEquals(new ProductPage().getSuccessAlertMsg(), "Success: You have added " + product + " to your shopping cart!\n" + "×");
    }

    @And("I click on shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
        Thread.sleep(2000);
    }

    @And("I should see the shopping text message")
    public void iShouldSeeTheShoppingTextMessage() {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains("Shopping Cart"), "Shopping Cart not matched");

    }

    @And("I should see the product name {string}")
    public void iShouldSeeTheProductName(String product) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), product,"Product name not matched");
    }

    @And("I change quantity {string} for product")
    public void iChangeQuantityForProduct(String quantity) {
        //2.11 Change Quantity "2"
        new ShoppingCartPage().changeQuantity(quantity);

    }

    @And("I click on update quantity")
    public void iClickOnUpdateQuantity() {
        //2.12 Click on “Update” Tab
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @And("I should see cart modified message")
    public void iShouldSeeCartModifiedMessage() {
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertTrue(new ShoppingCartPage().getSuccessModifiedMessage().contains("Success: You have modified your shopping cart!"));

    }

    @And("I should see the total {string}")
    public void iShouldSeeTheTotal(String total) {
        //2.14 Verify the Total £737.45
        Assert.assertEquals(new ShoppingCartPage().getTotal(), total, "Total not matched");

    }

    @And("I click on checkout button")
    public void iClickOnCheckoutButton() {
        //2.15 Click on “Checkout” button
        new HomePage().clickOnElement(new LaptopAndNotebookPage().clickOnCheckout);

    }

    @And("I should navigate to checkout page")
    public void iShouldNavigateToCheckoutPage() {
        //2.16 Verify the text “Checkout”
        new HomePage().getTextFromElement(new LaptopAndNotebookPage().verifyTheTextCheckout);

    }

    @And("I should see new customer text")
    public void iShouldSeeNewCustomerText() {
        //2.17 Verify the Text “New Customer”
        new HomePage().getTextFromElement(new LaptopAndNotebookPage().verifyTheTxtNewCustomer);

    }

    @And("I click on guest checkout button")
    public void iClickOnGuestCheckoutButton() {
        //2.18 Click on “Guest Checkout” radio button
        new HomePage().clickOnElement(new LaptopAndNotebookPage().clickOnGuestCheckout);

    }

    @And("I click on continue button of guest checkout page")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        //2.19 Click on “Continue” tab
        new HomePage().clickOnElement(new LaptopAndNotebookPage().ClickOnContinue);

    }

    @And("I filled all mandatory field of checkout page")
    public void iFilledAllMandatoryFieldOfCheckoutPage() {
        //2.20 Fill the mandatory fields
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().firstName, "Priyanka");
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().lastName, "Korat" );
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().eMail, "priyanka+123@gmail.com");
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().telephone, "07438939393993");
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().Address1,"Sydney");
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().city, "London");
        new LaptopAndNotebookPage().enterTheMandatoryField(new LaptopAndNotebookPage().postcode, "HA9 7AX");
        new LaptopAndNotebookPage().enterState();

    }

    @And("I click on continue after fill all detail on checkout page")
    public void iClickOnContinueAfterFillAllDetailOnCheckoutPage() {
        new LaptopAndNotebookPage().clickOnContinueButton();
    }

    @And("I add comments to text area about product order")
    public void iAddCommentsToTextAreaAboutProductOrder() {
        new LaptopAndNotebookPage().enterComment();
    }

    @And("I click on continue of checkout")
    public void iClickOnContinueOfCheckout() {
        new LaptopAndNotebookPage().clickOnContinueAfterComment();

    }

    @And("I click checkbox of terms and condition")
    public void iClickCheckboxOfTermsAndCondition() {
        new LaptopAndNotebookPage().clickOnAgreeTermsConditionCheckbox();
    }

    @Then("I should see warning message regarding Payment method")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() {
        new LaptopAndNotebookPage().clickOnPaymentMethodCont();
    }
}
