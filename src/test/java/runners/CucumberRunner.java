package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"ru.raiffeisen.demo"},
        plugin = {"json:target/cucumber-reports.json",
                "pretty",
                "html:target/cucumber-reports",
                "rerun:rerun.txt"
        }
        ,tags = {"@web"}
)
public class CucumberRunner {
}
