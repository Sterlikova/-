// Абстрактный класс для блюда
abstract class Dish {
    String name;
    String cuisine;

    void prepare() {
        System.out.println("Готовим " + name);
        System.out.println("Кухня: " + cuisine);
    }

    void cook() {
        System.out.println("Готовим блюдо");
    }

    void serve() {
        System.out.println("Подаем блюдо");
    }

    public String getName() {
        return name;
    }
}