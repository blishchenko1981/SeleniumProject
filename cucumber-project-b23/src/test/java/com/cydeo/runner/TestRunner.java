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
@CucumberOptions(  features = "src/test/resources/features" , //alternatively "classpath:features"
        glue = "com/cydeo/step_definitions" ,
        publish = true, // it will give you public link of your local html report
        plugin = {"pretty", "html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,  // store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target"  // fancy report
        } ,
        dryRun = false
               , tags = "@ui"
)
public class TestRunner {
}


