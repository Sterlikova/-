// Класс для вывода истории вычислений
class History {
    private static List<String> historyList = new ArrayList<>();

    public static void addToHistory(String expression, double result) {
        String historyEntry = expression + " = " + result;
        historyList.add(historyEntry);
        saveToFile(historyEntry);
    }

    public static void printHistory() {
        System.out.println("История вычислений:");
        for (String entry : historyList) {
            System.out.println(entry);
        }
    }

    private static void saveToFile(String historyEntry) {
        try {
            FileWriter writer = new FileWriter("history.txt", true);
            writer.write(historyEntry + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл: " + e.getMessage());
        }
    }
}
