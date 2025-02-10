package com.robot.robot_simulator;

public class Grid {
    private final int size;
    private final int[][] floor;

    public Grid(int size) {
        this.size = size;
        this.floor = new int[size][size];
    }

    public void mark(int x, int y) {
        floor[y][x] = 1;
    }

    public int getSize() {
        return size;
    }

    public void printGrid() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                System.out.print(floor[i][j] == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
