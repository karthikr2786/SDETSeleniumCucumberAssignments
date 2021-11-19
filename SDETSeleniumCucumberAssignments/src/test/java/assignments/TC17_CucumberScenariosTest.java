package assignments;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber/cucumber-reports/report",
        		"json:target/cucumber/cucumber.json",
        		"usage:target/cucumber/cucumber-usage.json",
        		"junit:target/cucumber/cucumber.xml",
        		"pretty:target/cucumber/cucumber-pretty.txt"},  
        features = "classpath:features/TC17_OrangeHRM.feature",
        glue="stepdefs",
        monochrome = true,
        strict=true,
        dryRun=false
        )

public class TC17_CucumberScenariosTest {

	

}
