package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//Login.feature",
        glue = "com.automation.steps",
        tags = "@Smoke or @Chirag"
)
public class TestRunner {

}
