package com.robot.robot_simulator;

public class CommandHandler {
    private final Robot robot;
    private final Grid grid;

    public CommandHandler(int gridSize) {
        this.robot = new Robot();
        this.grid = new Grid(gridSize);
    }

    public void processCommand(String command) {
        String[] parts = command.split(" ");
        switch (parts[0]) {
            case "M":
                int steps = Integer.parseInt(parts[1]);
                robot.move(steps, grid);
                break;
            case "L":
                robot.turnLeft();
                break;
            case "R":
                robot.turnRight();
                break;
            case "D":
                robot.setPenDown(true);
                break;
            case "U":
                robot.setPenDown(false);
                break;
            case "P":
                grid.printGrid();
                break;
            case "C":
                System.out.println(robot.getStatus());
                break;
        }
    }

}
