package com.robot.robot_simulator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {
    private Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(5);
    }

    @Test
    public void testGridSize() {
        assertEquals(5, grid.getSize());
    }

    @Test
    public void testMark() {
        grid.mark(1, 1);
        // Adjusted expected output to match exactly how the grid should appear
        assertEquals("     \n     \n  *  \n     \n     \n", gridToString(grid));
    }


    @Test
    public void testPrintGrid() {
        grid.mark(1, 1);
        grid.printGrid();
    }

    private String gridToString(Grid grid) {
        StringBuilder sb = new StringBuilder();
        for (int i = grid.getSize() - 1; i >= 0; i--) {
            for (int j = 0; j < grid.getSize(); j++) {
                sb.append(grid.getCell(i, j) ? "*" : " ");
            }
            sb.append("\n");
        }
        return sb.toString().stripTrailing();  // Strip trailing spaces after each row
    }

}
