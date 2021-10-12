package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    int actualResult;

    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("Calculator is open");
    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer int1, Integer int2) {
       actualResult = int1 + int2;
        System.out.println("actualResult = " + actualResult);

    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(int expectedResult) {
        assertEquals(actualResult,expectedResult);
    }


}
