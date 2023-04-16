package Calculator;

import java.lang.reflect.Array;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
    // Типы моделей (в идеали реализовать отдельные классы, унаследованные от Model)
    public enum Type {
        OPERATION,
        PARENTHESES,
        FUNCTION
    }

    public Type type;

    public Function<double[], Double> operation;
    public char[] symbol = new char[2];
    public String funcName;

    public Model(char symbol, Type type, Function<double[], Double> operation) {
        this.symbol[0] = symbol;
        this.type = type;
        this.operation = operation;
    }

    public Model(String funcName, Function<double[], Double> operation) {
        this.funcName = funcName;
        this.type = Type.FUNCTION;
        this.operation = operation;
    }

    public Model(char left, char right, Function<double[], Double> operation) {
        this.symbol[0] = left;
        this.symbol[1] = right;
        this.type = Type.PARENTHESES;
        this.operation = operation;
    }

     /**
      * Вычисляет выражения с определенной моделью
      *      Суть работы:
      *      Согласно установленным паттернам разбирает строку на операнды и предоставляет их на выполнение
      *      определенным в модели функциям
      *      В последующем, выражения заменяются и возвращается строка с вычисленным значением
      *
      *      (лучше разбить на классы)*/
    public String getExpression(String expression, Calculator calculator) {
        String doubleRegex = "(-?\\d+(\\.\\d+)?)";
        switch (this.type) {
            case OPERATION -> {
                String regex = doubleRegex + "\\" + this.symbol[0] + doubleRegex;
//                String regex = "(\\d)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(expression);

                if (matcher.find()) {
                    String tmp = matcher.group();
//                    System.out.println(tmp);
                    double[] params = {
                            Float.parseFloat(matcher.group(1)),
                            Float.parseFloat(matcher.group(3))
                    };
                    double result = this.operation.apply(params);
//                    System.out.println(result);
                    expression = expression.replace(tmp, Double.toString(result));
//                    System.out.println(expression);
                }
                return expression;
            }
            case PARENTHESES -> {
                if (this.symbol[1] == '\u0000') {
                    this.symbol[1] = this.symbol[0];
                }
                String regex = "\\" + this.symbol[0] + "(.+)" + "\\" + this.symbol[1];

//                System.out.println(regex);
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(expression);

                if (matcher.find()) {
//                    System.out.println(matcher.group(1));
                    String tmp = matcher.group();
                    String tmp1 = matcher.group(1);
                    regex = "^\\" + this.symbol[0] + "(" + doubleRegex + ")\\" + this.symbol[1] + "$";
                    pattern = Pattern.compile(regex);
                    matcher = pattern.matcher(expression);

                    if (matcher.find()) {
                        return expression.replace(tmp, Double.toString(
                                this.operation.apply(
                                        new double[]{
                                                Double.parseDouble(matcher.group(1))
                                        }
                                )
                        ));
                    } else {
                        return expression.replace(tmp, getExpression(this.symbol[0] + calculator.perform(tmp1) + this.symbol[1], calculator));
                    }
                }
                return expression;
            }
            case FUNCTION -> {
                String regex = this.funcName + "\\(" + doubleRegex + ",\\s?" + doubleRegex + "?\\)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(expression);

                if (matcher.find()) {
                    String tmp = matcher.group();
//                    System.out.println(tmp);
                    double[] params = {
                            Float.parseFloat(matcher.group(1)),
                            Float.parseFloat(matcher.group(3))
                    };
                    double result = this.operation.apply(params);
                    expression = expression.replace(tmp, Double.toString(result));
                }
                return expression;
            }
            default -> {
                return expression;
            }
        }
    }
}
