package runner;

import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/test/resources/basic.feature", plugin={"pretty", "html:target/CucumberProject/MyReport.xml"},
                    glue="stepcode",dryRun=false,tags="@example1")
@Test

public class BasicRunner extends AbstractTestNGCucumberTests{

	
	
}
