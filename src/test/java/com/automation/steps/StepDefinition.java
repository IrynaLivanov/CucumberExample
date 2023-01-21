package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("User open website")
    public void user_open_website() {
        System.out.println("1");
    }

    @Then("Verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("2");
    }


    @When("User enter the valid credentials")
    public void user_enter_the_valid_credentials() {
        System.out.println("3");
    }


    @Then("Verify home page is displayed")
    public void verify_home_page_is_displayed() {
        System.out.println("4");
    }


    @When("User search with TV")
    public void user_search_with_tv() {
        System.out.println("5");

    }

    @Then("Verify user is on product listing page")
    public void verify_user_is_on_product_listing_page() {
        System.out.println("6");

    }

    @When("User click on the first product from the list")
    public void user_click_on_the_first_product_from_the_list() {
        System.out.println("7");

    }

    @Then("Verify user is on product detail page")
    public void verify_user_is_on_product_detail_page() {
        System.out.println("8");

    }

    @When("User click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        System.out.println("10");

    }

    @Then("Verify cart page is displayed")
    public void verify_cart_page_is_displayed() {
        System.out.println("10");

    }

    @Then("verify item on the cart page")
    public void verify_item_on_the_cart_page() {
        System.out.println("11");


    }

    @When("user remove item from the cart")
    public void user_remove_item_from_the_cart() {
        System.out.println("12");
    }

    @Then("verify no item present in the cart")
    public void verify_no_item_present_in_the_cart() {
        System.out.println("13");

    }

    @When("user change quantity of the item")
    public void user_change_quantity_of_the_item() {
        System.out.println("14");
    }

    @Then("verify total quantity updated on the cart")
    public void verify_total_quantity_updated_on_the_cart() {
        System.out.println("15");
    }

    @Given("user open website")
    public void userOpenWebsite() {
        System.out.println("16");

    }

    @And("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        System.out.println("17");

    }

    @When("user enter the valid credentials")
    public void userEnterTheValidCredentials() {
        System.out.println("18");

    }

    @Then("verify home page is displayed")
    public void verifyHomePageIsDisplayed() {
        System.out.println("19");

    }

    @When("user enter the invalid credentials")
    public void userEnterTheInvalidCredentials() {
        System.out.println("20");

    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
        System.out.println("21");
    }

    @Then("close browser")
    public void close_browser() {
        System.out.println("22");


    }
}


