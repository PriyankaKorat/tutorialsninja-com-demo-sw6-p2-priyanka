package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I mouse hover on desktop link and click")
    public void iMouseHoverOnDesktopLinkAndClick() {
        new HomePage().mouseHoverAndClickOnDesktopTab();
    }

    @And("I call select menu and pass {string}")
    public void iCallSelectMenuAndPass(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String DesktopText) {
        Assert.assertEquals(new DesktopPage().getDesktopsText(),DesktopText,"Not navigate to Desktop page");
    }

    @When("I mouse hover on laptop and notebook link and click")
    public void iMouseHoverOnLaptopAndNotebookLinkAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I call select method and pass {string}")
    public void iCallSelectMethodAndPass(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I should see the title text {string}")
    public void iShouldSeeTheTitleText(String laptopNotebookText) {
        Assert.assertEquals(new LaptopAndNotebookPage().getLaptopsAndNotebooksText(),laptopNotebookText,"Not navigate to Laptops and Notebooks page");
    }

    @When("I mouse hover on computer and click on {string}")
    public void iMouseHoverOnComputerAndClickOn(String arg0) {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @And("I call select menu method and pass {string}")
    public void iCallSelectMenuMethodAndPass(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I should verify text {string}")
    public void iShouldVerifyText(String componentsText) {
        Assert.assertEquals(new ComponentsPage().getComponentsText(),componentsText,"Not navigate to Laptops and Notebooks page");
    }
}
