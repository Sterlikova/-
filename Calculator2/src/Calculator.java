class Calculator {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        String operator = "+";

        double result = Model.calculate(num1, num2, operator);
        History.addToHistory(num1 + " " + operator + " " + num2, result);

        num1 = 20.0;
        num2 = 4.0;
        operator = "*";

        result = Model.calculate(num1, num2, operator);
        History.addToHistory(num1 + " " + operator + " " + num2, result);

        num1 = 50.0;
        num2 = 0.0;
        operator = "/";

        result = Model.calculate(num1, num2, operator);
        History.addToHistory(num1 + " " + operator + " " + num2, result);

        num1 = 8.0;
        operator = "log";

        result = Model.calculate(num1, num2, operator);
        History.addToHistory(operator + "(" + num1 + ")", result);

        num1 = -10.0;
        operator = "mod";
        result = Model.calculate(num1, num2, operator);
        History.addToHistory(operator + "(" + num1 + ")", result);

        num1 = 2.0;
        num2 = 3.0;
        operator = "pow";

        result = Model.calculate(num1, num2, operator);
        History.addToHistory(num1 + "^" + num2, result);

        History.printHistory();
    }
}
