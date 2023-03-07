package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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

    //-----------------------------------------------------------------------------------------------//

    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalList) {

        System.out.println("animals = " + animalList);

    }

    @When("I call their names with below names")
    public void i_call_their_names_with_below_names(List<String> namesList) {
        System.out.println("namesList = " + namesList);

    }

    @Then("They come to me with some noise")
    public void theyComeToMeWithSomeNoise(List<List<String>> animalsNoiseList) {

        System.out.println(animalsNoiseList);


    }

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialsMap) {

        String username = credentialsMap.get("username");
        String pass = credentialsMap.get("password");


        WLoginPage loginPage = new WLoginPage();
        loginPage.login(username, pass);

    }

    @Given("this is the product reference")
    public void thisIsTheProductReference(List<Map<Object, Object>> prodouctMapLst) {
        System.out.println("prodouctMapLst = " + prodouctMapLst);

        for (Map<Object, Object> eachRowMap : prodouctMapLst) {
            System.out.println("eachRowMap = " + eachRowMap);

        }

    }


    //___________________________ practice for table_____________________________________
    @Given("User have following animals.")
    public void userHaveFollowingAnimals(List<String> animals) {
        System.out.println(animals+ " Animal will come to user");
    }

    @When("I call their names with below")
    public void iCallTheirNamesWithBelow(List<String> namesList) {
        System.out.println("names of Animals " + namesList);
    }

    @Then("They come to me and make sound.")
    public void theyComeToMeAndMakeSound(Map<String, String > animalSound) {

        System.out.println("Animal will make next sounds: " + animalSound);

    }


//    @Then("They come to me with some noise")
//    public void theyComeToMeWithSomeNoise(Map<String, String> animalsNoiseMap) {
//
//        System.out.println("animalsNoiseMap = " + animalsNoiseMap);
//
//
//    }
}
