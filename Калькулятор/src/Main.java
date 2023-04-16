import Calculator.*;

import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String menuHeader = "-- Калькулятор --";
        String[] commandNames = {
                "[1] Приступить к расчетам",
                "[2] История вычислений"
        };
        String menuFooter = "\"exit\" - для выхода";

        String request = "";
        System.out.println(menuHeader);
        while (!Objects.equals(request, "exit")) {
            for (String s : commandNames) System.out.println(s);
            System.out.println(menuFooter);
            request = scanner.next();

            switch (request) {
                case "1" -> {
                    System.out.println("Введите выражение:");
                    String expression = scanner.next();
                    while (!Objects.equals(expression, "exit")) {
                        System.out.println(" = " + calculator.calc(expression));
                        expression = scanner.next();
                    }
                    System.out.println('\n');
                }
                case "2" -> calculator.printHistory();
                case "exit" -> System.out.println("TheEnd");
                default -> {
                    System.out.println("Ненайденная команда. Ожидается номер пункта (\"1\", например)\n");
                }
            }
        }
    }
}