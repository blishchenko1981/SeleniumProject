package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {


    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("Calculator is open");
    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer int1, Integer int2) {
        System.out.println("Type "+ int1+ "+" +  int2);
    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(Integer int1) {
        System.out.println("Result on display is" + int1);
    }


}
