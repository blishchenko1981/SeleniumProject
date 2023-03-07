package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("{string} is hungry")
    public void john_is_hungry(String name) {

        System.out.println("this is given code "  + name +" is hungry");

    }

    @Then("{string} is hungry again")
    public void john_is_hungry_again(String name) {
        System.out.println(name +" need to get more food");
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

    @Given("{string} ate {string} and {string}")
    public void ate_chips_and_burger(String name, String dish1, String dish2) {
        System.out.println(name + " got some, like " + dish1 + " and " + dish2);
    }
    @When("{string} went to home")
    public void went_to_home(String name) {
        System.out.println("In 1 hour " + name + " got back home.");
    }

    @When("I learn and review {int} automation tools")
    public void i_learn_and_review_automation_tools(int toolsCount) {
        System.out.println(toolsCount + " tools should be reviewed again in order to refresh my memory: next priority API and SQL");
    }

    @Then("{string} had stomachache")
    public void had_stomachache(String name) {
        System.out.println(name + " stomach got hurt, and " + name + " went to hospital!!!");
    }




}


