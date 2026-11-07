package com.tailin.calculator;
import com.tailin.calculator.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write expression in format (a + b) or 'exit' for leaving");
        while(true){
            try {
                String statement = sc.nextLine();
                if (statement.equalsIgnoreCase("exit")) {
                    break;
                }
                String[] strings = statement.trim().split("\\s+");
                double a = Double.parseDouble(strings[0]);
                String op = strings[1];
                double b = Double.parseDouble(strings[2]);
                double result = Calculator.calculate(a, b, op);
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
