package com.cydeo.step_definitions;

import com.cydeo.pages.WAllOrderPage;
import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebOrderStepsPractice {

    WLoginPage loginPage = new WLoginPage();
    WAllOrderPage homePage = new WAllOrderPage();

    @Given("User on webOrder login page")
    public void user_on_web_order_login_page() {
        loginPage.goTo();

    }
    @When("user provide valid credentials")
    public void user_provide_valid_credentials() {

        loginPage.login("Tester", "test");
    }
    @Then("user can navigate to the webOrder home page")
    public void user_can_navigate_to_the_web_order_home_page() {

        Assert.assertTrue(homePage.userOnHomePage());
    }


    @When("user provide invalid credentials")
    public void userProvideInvalidCredentials() {

        loginPage.login("WrongName", "WrongPass");
    }

    @When("I provide username {string} and password {string}")
    public void iProvideUsernameAndPassword(String username, String password) {

        loginPage.login(username, password);

    }

    @When("we select {string} tab from sideBar")
    public void weSelectTabFromSideBar(String tabName) {
        WCommonArea commonArea = new WCommonArea();

        switch(tabName) {
            case "Order":
                commonArea.orderTab.click();
                break;

        }
    }
}
