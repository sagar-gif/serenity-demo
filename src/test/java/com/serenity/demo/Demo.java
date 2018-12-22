package com.serenity.demo;

import java.util.Arrays;
import java.util.Collection;
import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
public class Demo extends SerenityStories {

  private volatile int taskId;

  public Demo(int taskId) {
    System.setProperty("test_demo", taskId + "");
  }

  @TestData
  public static Collection<Object[]> data() throws Exception {
    return Arrays.asList(new Object[][]{{1}, {2}, {3}});
  }
}
