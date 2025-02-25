package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandHandlerTest {
    private CommandHandler commandHandler;
    private Robot robot;

    @Before
    public void setUp() {
        commandHandler = new CommandHandler(5); // Initialize CommandHandler
        robot = new Robot(); // Initialize Robot
    }

    @Test
    public void testProcessCommand_Move() {
        commandHandler.processCommand("M 2"); // Move 2 steps
        assertEquals("Position: 0, 2 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testProcessCommand_TurnLeft() {
        commandHandler.processCommand("L");
        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_TurnRight() {
        commandHandler.processCommand("R");
        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_PenDown() {
        commandHandler.processCommand("D");
        assertTrue(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_PenUp() {
        commandHandler.processCommand("U");
        assertFalse(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_PrintGrid() {
        commandHandler.processCommand("M 1");
        commandHandler.processCommand("P"); 
    }

    @Test
    public void testProcessCommand_CheckStatus() {
        commandHandler.processCommand("C");
        assertTrue(robot.getStatus().contains("Position: 0, 0"));
    }
}
