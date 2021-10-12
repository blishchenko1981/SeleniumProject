package com.cydeo.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableStepDef {

  @Given("I have {string}")
  //@Given("I have {word}")
public void i_have(String animal) {
    System.out.println("Given I have a " + animal);
}
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("when I call its names");
    }
    @Then("They come to me.")
    public void they_come_to_me() {
        System.out.println("Then they will come to me");
    }

    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalList) {

        System.out.println("animals = " + animalList);

    }
}
