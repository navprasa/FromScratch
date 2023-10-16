package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
        },
        //path of feature file
        features = {"src/test/resources/Features"},
        //path of step definition file
        glue = {"com.example.StepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
