package com.apollo.Apollo247;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\consultation.feature",glue= {"com.apollo.Apollo247"})


public class Testrunner {

}
