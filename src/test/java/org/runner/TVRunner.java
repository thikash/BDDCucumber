package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//features//TV.feature",
                //glue="org.steps.TVStepsDefinition",
                  plugin="html:target",
                  monochrome=true,
                  dryRun=false)
public class TVRunner {
	

}
