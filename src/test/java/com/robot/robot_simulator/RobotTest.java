package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
    private Robot robot;

    @Before
    public void setUp() {
        robot = new Robot();
    }

//    @Test
//    public void testInitialPosition() {
//        assertEquals("Position: 0, 0 - Pen: up - Facing: NORTH", robot.getStatus());
//    }

    @Test
    public void testPenDown() {
        robot.setPenDown(true);
        assertTrue(robot.isPenDown());
    }

    @Test
    public void testTurnRight() {
        robot.turnRight();
        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
    }

    @Test
    public void testTurnLeft() {
        robot.turnLeft();
        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
    }

    @Test
    public void testMoveNorth() {
        robot.move(1, new Grid(5));
        assertEquals("Position: 0, 1 - Pen: up - Facing: NORTH", robot.getStatus());
    }

//    @Test
//    public void testMark() {
//        robot.setPenDown(true);
//        robot.move(2, new Grid(5));
//        assertTrue(new Grid(5).isCellMarked(0, 1));
//        assertTrue(new Grid(5).isCellMarked(0, 2));
//    }
}
