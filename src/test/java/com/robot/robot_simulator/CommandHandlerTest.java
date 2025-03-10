package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandHandlerTest {
    private Robot robot;
    private Grid grid;
    private CommandHandler commandHandler;

    @Before
    public void setUp() {
        robot = new Robot();
        grid = new Grid(5);
        commandHandler = new CommandHandler(robot, grid);
    }

    @Test
    public void testProcessCommand_TurnRight() {
        commandHandler.processCommand("R");
        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_Move() {
        commandHandler.processCommand("M 2");
        assertEquals("Position: 2, 0 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testProcessCommand_PenDown() {
        commandHandler.processCommand("D");
        assertTrue(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_CheckStatus() {
        commandHandler.processCommand("C");
        assertEquals("Position: 0, 0 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testProcessCommand_PenUp() {
        commandHandler.processCommand("U");
        assertFalse(robot.isPenDown());
    }

    @Test
    public void testProcessCommand_TurnLeft() {
        commandHandler.processCommand("L");
        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
    }

    @Test
    public void testProcessCommand_PrintGrid() {
        commandHandler.processCommand("P");
        // You will need to capture the output here in your actual test framework to assert
    }

    @Test
    public void testMoveNorth() {
        robot.move(1, grid);
        assertEquals("Position: 0, 1 - Pen: up - Facing: NORTH", robot.getStatus());
    }

//    @Test
//    public void testMark() {
//        robot.setPenDown(true);
//        robot.move(2, grid);
//        assertTrue(grid.isCellMarked(0, 1));
//        assertTrue(grid.isCellMarked(0, 2));
//    }
}
