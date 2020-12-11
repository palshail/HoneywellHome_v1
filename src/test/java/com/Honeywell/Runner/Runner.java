package com.Honeywell.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/",
				glue = "com.Honeywell.TestCaseDefination",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","html:test-output.html"}
				)

public class Runner {

}
