package com.robot.robot_simulator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter grid size: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                return;
            }
            int gridSize = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            CommandHandler handler = new CommandHandler(gridSize);

            while (true) {
                System.out.print("Enter command: ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String command = scanner.nextLine().trim();

                if (command.equalsIgnoreCase("Q")) {
                    System.out.println("Exiting...");
                    break;
                }

                handler.processCommand(command);
            }
        } finally {
            scanner.close();
        }
    }
}
