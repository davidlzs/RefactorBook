package com.dliu.refactoring.chapter6.extractmethod;

import com.dliu.refactoring.GenericTestUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CustomerTest {
    @Test
    public void printOwing() {
        // setup
        Customer customer = new Customer("Home Inc.");
        customer.addOrder(new Order(150.0d));
        customer.addOrder(new Order(50.0d));
        GenericTestUtils.LogCapturer logCapturer = GenericTestUtils.LogCapturer.captureLogs(Customer.logger);

        // execute
        customer.printOwing();

        // assert
        logCapturer.stopCapturing();
        assertTrue(logCapturer.getOutput().contains("name:Home Inc."));
        assertTrue(logCapturer.getOutput().contains("amount:200.0"));
        logCapturer.clearOutput();
    }
}
