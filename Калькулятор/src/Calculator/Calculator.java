package Calculator;

import java.util.Objects;

public class Calculator {
    private CalculatorHistory history;

    public Calculator() {
        history = new CalculatorHistory();
    }

    // Определение функционала для моделей
    public static Model[][] priorities = {
            {new Model("log", (numbers) -> Math.log(numbers[0]) / Math.log(numbers[1]))},
            {new Model('|', Model.Type.PARENTHESES, (numbers) -> Math.abs(numbers[0]))},
            {new Model('(', ')', (numbers) -> numbers[0])},
            {new Model('^', Model.Type.OPERATION, (numbers) -> Math.pow(numbers[0], numbers[1]))},
            {
                    new Model('*', Model.Type.OPERATION, (numbers) -> numbers[0] * numbers[1]),
                    new Model('/', Model.Type.OPERATION, (numbers) -> numbers[0] / numbers[1])
            },
            {
                    new Model('+', Model.Type.OPERATION, (numbers) -> numbers[0] + numbers[1]),
                    new Model('-', Model.Type.OPERATION, (numbers) -> numbers[0] - numbers[1])
            },
    };

    protected String perform(String expression) {

        String tmp;
//        System.out.println(expression);

        // Этапы анализа выражения:
        // 1.Выбираем и вычисляем выражения в скобках, заменяем
        // 2.Выбираем и вычисляем модули, заменяем
        // 3.Выбираем и вычисляем степени (a^b), заменяем
        // 4.Выбираем и вычисляем умножение или деление, заменяем
        // 5.Выбираем и вычисляем сумму и разницу чисел, заменяем

        // Проходится по операциям, с учетом их приоритета
        for (int i = 0; i < priorities.length; i++) {
//            System.out.println(priorities[i][0].symbol);
            for (int j = 0; j < priorities[i].length; j++) {
                tmp = priorities[i][j].getExpression(expression, this);
                while (!Objects.equals(tmp, expression)) {
                    expression = tmp;
                    tmp = priorities[i][j].getExpression(expression, this);
                }
            }
        }

        return expression;
    }

    public String calc(String expression) {
        expression = expression.replaceAll("\\s", "");
        String result = perform(expression);
        history.add(expression + "=" + result);
        return perform(expression);
    }

    public void printHistory() {
        history.out();
    }
}
