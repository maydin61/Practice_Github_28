package com.VyTrack.Runner;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
        },
        features = "src/test/resources/features",
        glue = "java/com/VyTrack/step_definitions",
        dryRun = false,
        tags = ""
)



public class CukesRunner {

}
