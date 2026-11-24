package com.tailin.calculator;
import com.tailin.calculator.calculator.Calculator;
import com.tailin.calculator.calculator.HistoryManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistoryManager historyManager = new HistoryManager();
        System.out.println("Write expression in format (a + b) or 'exit' for leaving / 'help' for all commands");
        while(true){
            try {
                String statement = sc.nextLine();
                if (statement.equalsIgnoreCase("exit")) {
                    break;
                }
                if (statement.equalsIgnoreCase("history")) {
                    historyManager.calcHistory();
                    continue;
                }
                if (statement.equalsIgnoreCase("last")) {
                    historyManager.lastResult();
                    continue;
                }
                if (statement.equalsIgnoreCase("clear")) {
                    historyManager.clearHistory();
                    continue;
                }
                if (statement.equalsIgnoreCase("help")) {
                    System.out.println("exit - leave from calculator");
                    System.out.println("history - show calculator history");
                    System.out.println("last - check the last result in history");
                    System.out.println("clear - remove all from history");
                    continue;
                }
                String[] strings = statement.trim().split("\\s+");
                double a = Double.parseDouble(strings[0]);
                String op = strings[1];
                double b = Double.parseDouble(strings[2]);
                double result = Calculator.calculate(a, b, op);
                historyManager.addOperation(a + " " + op + " " + b + " = " + result);
                System.out.println(a + " " + op + " " + b + " = " + result);
            } catch (NumberFormatException e){
                System.out.println("Error: unknown operation or not number");
            } catch (ArithmeticException e) {
                System.out.println("Error " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected message " + e.getMessage());
            }


        }
    }
}
