package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandHandlerTest {
    private CommandHandler commandHandler;
    private Robot robot;

    @Before
    public void setUp() {
        commandHandler = new CommandHandler(5); // R1: Initialize CommandHandler
        robot = new Robot(); // Initialize Robot
    }

    @Test
    public void testProcessCommand_Move() {
        // R2: Move command
        commandHandler.processCommand("M 2"); // Move 2 steps
        assertEquals("Position: 0, 2 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testProcessCommand_TurnLeft() {
        // R4: Turn left command
        commandHandler.processCommand("L");
        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_TurnRight() {
        // R4: Turn right command
        commandHandler.processCommand("R");
        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_PenDown() {
        // R3: Pen down command
        commandHandler.processCommand("D");
        assertTrue(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_PenUp() {
        // R3: Pen up command
        commandHandler.processCommand("U");
        assertFalse(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_PrintGrid() {
        // R5: Print grid command
        commandHandler.processCommand("M 1"); // Move 1 step
        commandHandler.processCommand("P"); // Print grid
        // Verify manually in the console output (you can't assert printed grid easily in unit test)
    }

    @Test
    public void testProcessCommand_CheckStatus() {
        // R6: Check robot status
        commandHandler.processCommand("C");
        assertTrue(robot.getStatus().contains("Position: 0, 0"));
    }
}
