package com.robot.robot_simulator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter grid size: ");
            int gridSize = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            CommandHandler handler = new CommandHandler(gridSize); // Correcting instantiation of CommandHandler

            while (true) {
                System.out.print("Enter command: ");
                String command = scanner.nextLine();
                handler.processCommand(command); // Correctly invoking processCommand
            }
        } finally {
            scanner.close();
        }
    }
}
