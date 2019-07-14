package amazonTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                dryRun = false,
                //tags = "@search",
                //glue = { "com.amazon.framework.amazonTesting.steps" },
                plugin = { "pretty","json:target/amazon-test.json" })
public class RunCukeTests {
    //Run BDD Cucumber Tests
}
