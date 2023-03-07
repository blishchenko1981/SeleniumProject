package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondJobStepDefs {
    @Given("I already have first job")
    public void i_already_have_first_job() {
        System.out.println("I working for the Ally-financial as a automation tester!");
    }

    @When("Current project ends")
    public void current_project_ends() {

        System.out.println("Based on project schedule it will ends in 2,5 months");

    }
    @Then("I should be able to get second project")
    public void i_should_be_able_to_get_second_project() {

        System.out.println("I should work hard to get second project");
    }

}
