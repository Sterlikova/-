public class History { private static StringBuilder history = new StringBuilder();

    public static void addToHistory(String expression, double result) {
        history.append(expression).append(" = ").append(result).append("\n");
    }

    public static void printHistory() {
        System.out.println("История вычислений:");
        System.out.println(history);
    }
}
