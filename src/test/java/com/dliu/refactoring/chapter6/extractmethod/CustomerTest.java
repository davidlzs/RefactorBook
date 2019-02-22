package com.dliu.refactoring.chapter6.extractmethod;

import com.dliu.refactoring.GenericTestUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CustomerTest {
    @Test
    public void printOwing() {
        // setup
        Customer customer = new Customer("Home Inc.");
        GenericTestUtils.LogCapturer logCapturer = GenericTestUtils.LogCapturer.captureLogs(Customer.logger);

        // execute
        customer.printOwing(200.0d);

        // assert
        logCapturer.stopCapturing();
        assertTrue(logCapturer.getOutput().contains("name:Home Inc."));
        assertTrue(logCapturer.getOutput().contains("amount:200.0"));
        logCapturer.clearOutput();
    }
}
