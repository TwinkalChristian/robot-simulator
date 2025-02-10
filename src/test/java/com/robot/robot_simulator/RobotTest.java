package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
    private Robot robot;

    @Before
    public void setUp() {
        robot = new Robot(); // R1: Ensures the robot starts at (0,0) with pen up
    }

    @Test
    public void testInitialPosition() {
        // R1: Confirm initial position, pen state, and direction
        assertEquals("Position: 0, 0 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testMoveNorth() {
        // R2: Move the robot north by 1 step and verify position
        robot.move(1, new Grid(5)); // Move 1 step north
        assertEquals("Position: 0, 1 - Pen: up - Facing: NORTH", robot.getStatus());
    }

    @Test
    public void testTurnRight() {
        // R4: Ensure robot turns right correctly
        robot.turnRight();
        assertEquals("Position: 0, 0 - Pen: up - Facing: EAST", robot.getStatus());
    }

    @Test
    public void testTurnLeft() {
        // R4: Ensure robot turns left correctly
        robot.turnLeft();
        assertEquals("Position: 0, 0 - Pen: up - Facing: WEST", robot.getStatus());
    }

    @Test
    public void testPenDown() {
        // R3: Check if pen can be put down
        robot.setPenDown(true);
        assertTrue(robot.isPenDown());
    }

    @Test
    public void testMoveWithPenDown() {
        // R3, R2: Move robot while pen is down, ensuring trail is marked
        robot.setPenDown(true);
        robot.move(1, new Grid(5));
        assertEquals("Position: 0, 1 - Pen: down - Facing: NORTH", robot.getStatus());
    }
}
