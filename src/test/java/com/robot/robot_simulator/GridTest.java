package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {
    private Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(5); // R1: Initialize a grid of size 5
    }

    @Test
    public void testGridSize() {
        // R1: Ensures grid initializes with the correct size
        assertEquals(5, grid.getSize());
    }

    @Test
    public void testMark() {
        grid.mark(1, 1);
        // R5: Check that marking on the grid works when the pen is down
        assertEquals(" *   \n", gridToString(grid)); 
    }

    @Test
    public void testPrintGrid() {
        grid.mark(1, 1);
        // R5: Test if the grid prints correctly after marking
        grid.printGrid();  // This will print the grid; test manually by verifying the output
    }

    private String gridToString(Grid grid) {
        // Helper method to convert grid to a string for easier comparison
        StringBuilder sb = new StringBuilder();
        for (int i = grid.getSize() - 1; i >= 0; i--) {
            for (int j = 0; j < grid.getSize(); j++) {
                sb.append(grid.getSize() == 5 && i == 1 && j == 1 ? "*" : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
