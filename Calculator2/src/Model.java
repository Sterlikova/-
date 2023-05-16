import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Класс для математических операций
class Model {
    public static double calculate(double num1, double num2, String operator) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
                break;
            case "log":
                result = Math.log(num1);
                break;
            case "mod":
                result = Math.abs(num1);
                break;
            case "pow":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Ошибка: недопустимый оператор!");
                break;
        }
        return result;
    }
}
