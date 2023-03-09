package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class FailedTestRunners {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = "com/cydeo/step_definitions",
            features = "@target/rerun.txt"
    )
    public class FailedTestRunner {
    }
}


// glue = "com/cydeo/step_definitions",
//