package com.cydeo.runner;
//this class has only one purpose
//instructing how and what feature we want to run
//where are the step definitions
//do we want to just generate missing step definitions
//do we want to get json, html report
//do we want to filter the test run according to certain tags


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   features = "src/test/resources/features",// another way "classpath:features"
                        glue = "com/cydeo/step_definitions"  ,
                      plugin = {"pretty",
                              "json:target/cucumber.json",
                              "html:target/cucumber_report.html",
                               "rerun:target/rerun.txt"  },
                      dryRun = false,
                   tags = "@libraryLogin"
                       )
public class TestRunner {

}
