package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Тесты ---");
        System.out.println("5 + 3 = " + calculate(5, 3, "+"));   // ожидается: 8
        System.out.println("5 / 2 = " + calculate(5, 2, "/"));   // ожидается: 2
        System.out.println("10 - 3 = " + calculate(10, 3, "-")); // ожидается: 7
        System.out.println("4 * 6 = " + calculate(4, 6, "*"));   // ожидается: 24
        System.out.println("--- Конец тестов ---\n");

        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                String statement = sc.nextLine();
                if (statement.equals("exit")) {
                    break;
                }
                String[] strings = statement.split(" ");
                int a = Integer.parseInt(strings[0]);
                String op = strings[1];
                int b = Integer.parseInt(strings[2]);
                switch (op) {
                    case "+" -> System.out.println(a + " + " + b + " = " + (a + b) );
                    case "-" -> System.out.println(a + " - " + b + " = " + (a - b) );
                    case "*" -> System.out.println(a + " * " + b + " = "+ (a * b) );
                    case "/" -> {
                        if(b == 0){
                            System.out.println("Error: u can't divisible on 0");
                        } else {
                            System.out.println(a + " / " + b + " = "+ (a / b) );
                        }
                    }

                }
            } catch (NumberFormatException e){
                System.out.println("Error: please write correct number or operation");
            }

        }
    }

    private static int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> a / b;
        };
    }
}
