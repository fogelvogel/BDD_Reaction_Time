import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Features",glue="StepDefinition")
@CucumberOptions(
        glue = {"step_definitions"} )
public class RunnerTest
{

}