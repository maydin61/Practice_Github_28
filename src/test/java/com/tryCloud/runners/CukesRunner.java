package com.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {"html:target/cucumber-reports.html",
                    // for reporting using cucumber : as the name of "cucumber-reports.html"
                    "rerun:target/rerun.txt",
                   // "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/features",

            glue = "com/tryCloud/step_definitions",
                        // where we pass step_definitions path
            dryRun = false,
                            // if true : not executing the step definitions
                            // if false: executing the step definitions
            tags = "@wip"
                            // run the given name scenario(s) using the following keywords
                            // or(one of the given )    , and(both of the given)    ,   and not(first run second not)




    )
    public class CukesRunner {
}

