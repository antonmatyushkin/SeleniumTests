package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun.txt",
        glue = {"ru.raiffeisen.demo"},
        plugin = {"json:target/cucumber-report.json",
                "pretty",
                "html:target/cucumber-reports"})
public class CucumberReRunner {
}