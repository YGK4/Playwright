package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature", // Path to the feature files (relative path)
    glue = "ExampleClass", // Package where the step definition classes are located
    plugin = {"pretty", "html:target/cucumber-report.html"} // Reporting: Pretty format & HTML report
)
public class RunCucumberTest {
    // No need for additional code here, this class is just used to trigger Cucumber tests
}



