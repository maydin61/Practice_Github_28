package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
               // "pretty",
                "html:target/cucumber-reports.html",
                // for reporting using cucumber : as the name of "cucumber-reports.html"
                "rerun:target/rerun.txt",
               // "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        //src/test/resources/features/trylogin.feature


        glue = "src/test/java/com/tryCloud/step_definitions",
        // How does my project know where to find the Hooks class and execute the annotations?
        // Basically logic is coming from the cucumber annotations and also glue path we provide in the runner class.

        dryRun = false,
        //dryRun = true --> do NOT run my step_definitions, but only CHECK if any step is missing snippet
        //dryRun = false --> this will TURN OFF dryRun, and our code will run as expected

        //tags = "@librarian or @student or @admin"
        //tags = "@Regression"
        // runs the @Regression senior


        tags = "@wip"
        //  runs the @Regression senior but not @student
        // if tags " " is empty all the senior will run

        // run only the tags name given in "......" in the .....feature FILE @........
        //                                "@librarian"      login.feature_tryCloud / @librarian
//        publish = false

)
public class CukesRunner {
}