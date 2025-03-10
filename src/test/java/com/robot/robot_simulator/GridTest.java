package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {
    private Robot robot;
    private Grid grid;

    @Before
    public void setUp() {
        robot = new Robot();
        grid = new Grid(5);
    }

    @Test
    public void testInitialPosition() {
        assertEquals("Position: 0, 0 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testMoveWithPenDown() {
        robot.setPenDown(true);
        robot.move(2, grid);
        assertTrue(grid.isCellMarked(0, 1));
        assertTrue(grid.isCellMarked(0, 2));
    }

//    @Test
//    public void testPenDown() {
//        robot.setPenDown(true);
//        assertTrue(robot.isPenDown());
//    }
//
//    @Test
//    public void testTurnRight() {
//        robot.turnRight();
//        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
//    }
//
//    @Test
//    public void testTurnLeft() {
//        robot.turnLeft();
//        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
//    }
//
//    @Test
//    public void testMoveNorth() {
//        robot.move(1, grid);
//        assertEquals("Position: 0, 1 - Pen: up - Facing: NORTH", robot.getStatus());
//    }

    @Test
    public void testMark() {
        robot.setPenDown(true);
        robot.move(2, grid);
        assertTrue(grid.isCellMarked(0, 1));
        assertTrue(grid.isCellMarked(0, 2));
    }

    @Test
    public void testPrintGrid() {
        robot.move(2, grid);
        grid.printGrid();
        // Check output manually or use System.setOut() to capture the output
    }
}
