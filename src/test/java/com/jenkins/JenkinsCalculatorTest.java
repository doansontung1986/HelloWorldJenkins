package com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class JenkinsCalculatorTest {

    @Test
    public void addNumbers() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        Assert.assertEquals(10, calculator.addNumbers(5, 5));
    }

    @Test
    public void subtractNumbers() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        Assert.assertEquals(5, calculator.subtractNumbers(10, 5));
    }
}