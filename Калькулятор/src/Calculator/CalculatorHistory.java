package Calculator;

import java.io.*;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class CalculatorHistory {
    public static String historyFilePath = "./history.txt";

    public LinkedList<String> history = new LinkedList<>();

    // Инициализация массива (чтение из файла)
    public CalculatorHistory() {
        try
        {
            FileReader reader = new FileReader(historyFilePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                history.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Добавление новой записи в историю
    public void add(String expression) {
        try {
            FileWriter writer = new FileWriter(historyFilePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(expression + '\n');
            history.add(expression);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Вывод истории
    public void out() {
        System.out.println("\nИстория операций:");
        for (String s : history) System.out.println(">  " + s);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println('\n');
    }
}
