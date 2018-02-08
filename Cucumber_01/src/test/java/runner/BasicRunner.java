package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/basic.feature", plugin={"pretty", "html:target/cucreport/myhtmlReport"}, glue="stepdef"
				,dryRun=false, tags="@outline")
@Test
public class BasicRunner extends AbstractTestNGCucumberTests{

}
