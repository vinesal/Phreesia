package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        glue = "step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        publish = true

)
public class CucumberRunner {

}
