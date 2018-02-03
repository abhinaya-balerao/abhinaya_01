package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/basic.feature", plugin={"pretty", "html:report/myhtmlReport"}, glue="stepdef")
@Test
public class BasicRunner extends AbstractTestNGCucumberTests{

}
