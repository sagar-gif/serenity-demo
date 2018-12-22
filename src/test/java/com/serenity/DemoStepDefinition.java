package com.serenity;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class DemoStepDefinition {

  @Given("Test case is prepared")
  public void prepared() {

  }

  @When("Test case is being executed")
  public void executing() {

  }

  @Then("Test case execution is finished")
  public void finished() {
    if ("2".equals(System.getProperty("test_demo"))) {
      Assert.assertTrue(1 == 0);
    }
  }
}
