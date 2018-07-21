package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features/",    
	glue = "steps", 							  
	tags = "@smoke",								   
	plugin = {"pretty", "html:report/demo-report" },
	monochrome = true,
	snippets = SnippetType.CAMELCASE,
	dryRun = false,
	strict = false
)
public class Runner {

}
