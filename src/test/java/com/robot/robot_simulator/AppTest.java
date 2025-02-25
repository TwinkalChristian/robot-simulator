package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(
        "5\nM 2\nP\nQ\n".getBytes() // Simulated user input: Grid size, Move, Print, Quit
    );

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @Test
    public void testAppMain() {
        String[] args = {};
        App.main(args);

        String output = outContent.toString();
        
        assertTrue(output.contains("Enter grid size:"));
        assertTrue(output.contains("Enter command:"));
        assertTrue(output.contains("Position: 0, 2 - Pen: up - Facing: NORTH"));
        assertTrue(output.contains("*"));  // Checking if grid output includes trail
        assertTrue(output.contains("Exiting...")); // Ensuring program exits gracefully
    }
}
