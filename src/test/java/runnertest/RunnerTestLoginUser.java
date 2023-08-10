package runnertest;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepdefinitions"},
        features = {"src/test/resources/feature/login/login.feature"},
//        plugin = {"pretty", "html:target/cucumber", "json:target/runnertest.login.RunnerTestLoginUser.json"},
        tags = "@smoke",
        snippets = SnippetType.UNDERSCORE
)
public class RunnerTestLoginUser {
}