package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("5\nM 2\nP\nQ\n".getBytes()); // Simulate input

    @Before
    public void setUp() {
        // Redirect system input and output to simulate interaction
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @Test
    public void testAppMain() {
        // R1: Ensures the grid initializes correctly with a user input size.
        String[] args = {};
        App.main(args);  // This will read from the inContent stream

        // R6: Checks if robot status is displayed correctly.
        String output = outContent.toString();
        
        assertTrue(output.contains("Enter grid size:"));
        assertTrue(output.contains("Enter command:"));
        assertTrue(output.contains("Position: 0, 2 - Pen: up - Facing: NORTH"));
        assertTrue(output.contains("*"));  // R5: Checking if grid output includes trail
    }
}
