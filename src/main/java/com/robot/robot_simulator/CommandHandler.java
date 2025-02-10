package com.robot.robot_simulator;

public class CommandHandler {
    private final Robot robot;
    private final Grid grid;

    public CommandHandler(int gridSize) {
        this.robot = new Robot();
        this.grid = new Grid(gridSize);
    }

    public void processCommand(String command) {
        switch (command.toUpperCase()) {
            case "U": robot.setPenDown(false); break;
            case "D": robot.setPenDown(true); break;
            case "R": robot.turnRight(); break;
            case "L": robot.turnLeft(); break;
            case "P": grid.printGrid(); break;
            case "C": System.out.println(robot.getStatus()); break;
            case "Q": System.exit(0);
            default:
                if (command.startsWith("M ")) {
                    int steps = Integer.parseInt(command.substring(2));
                    robot.move(steps, grid);
                }
                break;
        }
    }
}
