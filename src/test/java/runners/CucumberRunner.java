package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"}
        ,glue = {"ru.raiffeisen.demo"}
        ,plugin = {"pretty", "ru.raiffeisen.demo.reporter.AllureReporter"}
        ,tags = {"@final"}
        )

public class CucumberRunner {
}
