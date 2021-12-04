package Definitions;

import CheckSteps.DoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DoDefinitions {

    @Steps
    DoSteps steps;

    @Given("go to page")
    public void go_to_page() {

        steps.isPageLoaded();


    }

    @When("step1")
    public void step1() {

        steps.goToSignInPage();


    }

    @Then("enter {string} and {string}")
    public void enter_and(String string1, String string2) {

        steps.enterCredentials(string1, string2);


    }

    @Then("step2")
    public void step2() {

        steps.clickLogIn();

    }

    @Then("next page loaded")
    public void next_page_loaded() {

        steps.isLoggedIn();

    }

    @Then("cannot log in")
    public void cannot_log_in() {

        steps.errorTextShowed();


    }
}
