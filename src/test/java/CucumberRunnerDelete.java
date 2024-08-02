import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html", "json:target/testReport.json"},
        features = "/Users/macbookpro/Desktop/HelenProject/CucumberProject/src/test/resources/featuers",
        glue = "step_definitions",
        tags = "@DeleteTeachersFunctionality",
        dryRun = false

)
public class CucumberRunnerDelete {
}
