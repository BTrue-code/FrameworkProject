package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //the path of feature directory/file
        features = "src/test/resources/features",

        //name of the package where step definitions are available
        glue = "steps",
        dryRun = false,
        tags = "@employeecredentials",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)

public class TestRunner {

}
