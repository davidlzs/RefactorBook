package com.dliu.refactoring.chapter6.extractmethod;

import com.dliu.refactoring.GenericTestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void printOwning() {
        // setup
        String expected = "Summary:\r\n" +
                "name:Home Inc.\r\n" +
                "amount:200.0\r\n";
        Customer customer = new Customer("Home Inc.");
        GenericTestUtils.LogCapturer logCapturer = GenericTestUtils.LogCapturer.captureLogs(Customer.logger);

        // execute
        customer.printOwning(200.0d);

        // assert
        logCapturer.stopCapturing();
        assertEquals(expected, logCapturer.getOutput());
        logCapturer.clearOutput();
    }
}
