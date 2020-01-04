package ODOO.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",

        glue = "ODOO/step_definitions",

        dryRun = false,
        tags = "",

        plugin = {"html:target/default-cucumber-reports"}

)

public class CukesRunner {
}
