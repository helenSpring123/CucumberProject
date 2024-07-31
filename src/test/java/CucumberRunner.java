import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumberReport.html","json: target/testReport.json"},
        features = "C:\\Users\\helen\\OneDrive\\Desktop\\Batch 6\\CucumberProject\\src\\test\\resources\\featuers",
        glue = "step_definitions",
        tags = "@signup",
        dryRun = false
)

public class CucumberRunner {
    
}
