package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun.txt",
        //Cucumber picks the failed scenarios from this file ,
        glue = {"ru.aplana.demo"},
        plugin = {"json:target/cucumber-report.json",
                "pretty",
                "html:target/cucumber-reports"})
public class CucumberReRunner {
}