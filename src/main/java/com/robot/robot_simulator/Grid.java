package com.robot.robot_simulator;

public class Grid {
    private int size;
    private boolean[][] cells;

    public Grid(int size) {
        this.size = size;
        this.cells = new boolean[size][size];
    }

    public int getSize() {
        return size;
    }

    public void mark(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            cells[x][y] = true;
        }
    }

    public boolean getCell(int x, int y) {
        return cells[x][y];
    }

    public void printGrid() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                System.out.print(cells[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }
}

