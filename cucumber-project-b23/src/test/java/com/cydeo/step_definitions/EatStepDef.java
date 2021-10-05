package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("John is hungry")
    public void john_is_hungry() {

        System.out.println("this is given code john is hungry");

    }
    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer quantity) {

        System.out.println("this is @When code shows how many he_ate_cucumbers  -" + quantity);
    }

    @Then("he will be full")
    public void he_will_be_full() {

        System.out.println("this is @Then code he_will_be_full");

    }
    @Given("Vitalii want to eat")
    public void ivan_is_hungry() {
        System.out.println("@Given ivan is hungry");
    }


    @Then("He feel stuffed")
    public void he_faints() {

        System.out.println("@Then he faints code");

    }



}


